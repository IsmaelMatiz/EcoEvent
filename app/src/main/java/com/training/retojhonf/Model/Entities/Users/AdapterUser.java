package com.training.retojhonf.Model.Entities.Users;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.training.retojhonf.R;

import java.util.ArrayList;

public class AdapterUser extends BaseAdapter {
    ArrayList<DTOUser> userList;
    DAOUser dao;
    Activity activity;

    public AdapterUser(ArrayList<DTOUser> userList, DAOUser dao, Activity activity) {
        this.userList = userList;
        this.dao = dao;
        this.activity = activity;
    }

    @Override
    public int getCount() { return userList.size(); }

    @Override
    public Object getItem(int position) {
        DTOUser user = userList.get(position);
        return user;
    }

    @Override
    public long getItemId(int position) {
        DTOUser user = userList.get(position);
        return user.getUserId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DTOUser user;
        View v = convertView;
        if (v == null){
            LayoutInflater li = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = li.inflate(R.layout.item_user, null);
        }

        user = userList.get(position);

        TextView txtEmail = v.findViewById(R.id.txt_email);
        TextView txtPassword = v.findViewById(R.id.txt_password);

        txtEmail.setText(user.getEmail());
        txtPassword.setText(user.getPassword());

        return v;
    }
}
