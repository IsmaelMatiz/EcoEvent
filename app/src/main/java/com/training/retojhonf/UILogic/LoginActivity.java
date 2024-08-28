package com.training.retojhonf.UILogic;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.training.retojhonf.Model.Entities.Users.DAOUser;
import com.training.retojhonf.R;

public class LoginActivity extends AppCompatActivity {
    DAOUser dao;
    EditText username, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        dao = new DAOUser(this);
        username = findViewById(R.id.inp_email);
        password = findViewById(R.id.inp_password);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString().trim();
                String pass = password.getText().toString().trim();

                switch (dao.authenticateUser(user,pass))
                {
                    case 0:
                        Toast.makeText(LoginActivity.this, "Ingreso exitoso", Toast.LENGTH_SHORT).show();
                        // Redirigir a otra actividad
                        Intent intent = new Intent(LoginActivity.this, Home_in.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(LoginActivity.this, "Ingreso fallido email incorrecto", Toast.LENGTH_SHORT).show();
                    default:
                        Toast.makeText(LoginActivity.this, "Ingreso fallido clave incorrecta", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }
}