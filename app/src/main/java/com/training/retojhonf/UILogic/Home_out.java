package com.training.retojhonf.UILogic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.training.retojhonf.R;

public class Home_out extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_out);

        ImageView logoImageView = findViewById(R.id.logoImageView);
        TextView mensajeTextView = findViewById(R.id.mensajeTextView);
        Button iniciarSesionButton = findViewById(R.id.iniciarSesionButton);
        Button uneteButton = findViewById(R.id.uneteButton);

        iniciarSesionButton.setOnClickListener(v -> {
            // Lógica para la pantalla de inicio de sesión
            // Abre una nueva actividad o fragmento
            Intent login = new Intent(Home_out.this, LoginActivity.class);
            startActivity(login);
        });

        uneteButton.setOnClickListener(v -> {
            // Lógica para la pantalla de registro o unete
            // Abre una nueva actividad o fragmento
            Intent login = new Intent(Home_out.this, Register.class);
            startActivity(login);
        });
    }
}