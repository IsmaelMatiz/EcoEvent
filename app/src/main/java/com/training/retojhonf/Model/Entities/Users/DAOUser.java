package com.training.retojhonf.Model.Entities.Users;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.training.retojhonf.Model.Entities.Constants;

import java.util.ArrayList;

public class DAOUser {
    SQLiteDatabase sql;
    ArrayList<DTOUser> users = new ArrayList<>();
    Context context;

    public DAOUser(Context con) {
        context = con;

        sql = context.openOrCreateDatabase(Constants.dbName,Context.MODE_PRIVATE,null);
        sql.execSQL("CREATE TABLE IF NOT EXISTS "+ Constants.TableUsers.TabName.getTextInfo() +"(" +
                Constants.TableUsers.ColUserId.getTextInfo()+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
                Constants.TableUsers.ColFullName.getTextInfo()+" text, "+
                Constants.TableUsers.ColEmail.getTextInfo()+" text UNIQUE, "+
                Constants.TableUsers.ColPassword.getTextInfo()+" text, "+
                Constants.TableUsers.ColSecQuestion1.getTextInfo()+" text, "+
                Constants.TableUsers.ColAnsQuest1.getTextInfo()+" text, "+
                Constants.TableUsers.ColSecQuestion2.getTextInfo()+" text, "+
                Constants.TableUsers.ColAnsQuest2.getTextInfo()+" text) "
                );
    }

    public boolean insertUser(DTOUser user){
        ContentValues values = new ContentValues();
        values.put(Constants.TableUsers.ColEmail.getTextInfo() ,user.getEmail());
        values.put(Constants.TableUsers.ColPassword.getTextInfo(),user.getPassword().hashCode());
        values.put(Constants.TableUsers.ColFullName.getTextInfo() ,user.getFullName());
        values.put(Constants.TableUsers.ColSecQuestion1.getTextInfo() ,user.getSecQuestion1());
        values.put(Constants.TableUsers.ColAnsQuest1.getTextInfo() ,user.getAnsQuestion1());
        values.put(Constants.TableUsers.ColSecQuestion2.getTextInfo() ,user.getSecQuestion2());
        values.put(Constants.TableUsers.ColAnsQuest2.getTextInfo() ,user.getAnsQuestion2());

        return sql.insert(Constants.TableUsers.TabName.getTextInfo(),null,values) > 0;
    }

    public ArrayList<DTOUser> getAllUsers() {
        if(users != null)
            users.clear();

        Cursor cursor = sql.rawQuery(
                "SELECT * FROM " + Constants.TableUsers.TabName.getTextInfo()
                ,null
        );

        if (cursor != null && cursor.getCount() > 0){
            cursor.moveToFirst();
            do {
                users.add(new DTOUser(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getString(7)
                ));
            }while (cursor.moveToNext());
        }

        return users;
    }

    //return 0 puede pasar
    //return 1 email incorrecto
    //return 2 clave incorrecta
    public int authenticateUser(String email, String password) {
        DTOUser userInfo =  null;

        Cursor cursor = sql. rawQuery(
                "SELECT * FROM " + Constants.TableUsers.TabName.getTextInfo() +
                        " WHERE email = '" +email + "'"
                ,null
        );

        if (cursor != null && cursor.getCount() > 0){
            cursor.moveToFirst();
            do {
                userInfo = new DTOUser(
                        cursor.getInt(0),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getString(7)
                );

                Log.i("EcoEvent","clave obtenida: "+userInfo.getPassword()+
                        " clave ingresada: "+password.hashCode()+
                        "\n compare: "+ userInfo.getPassword().equals(String.valueOf(password.hashCode())));

            return userInfo.getPassword().equals(String.valueOf(password.hashCode())) ? 0 : 2;
            }while (cursor.moveToNext());
        }else
            return 1;
    }

}
