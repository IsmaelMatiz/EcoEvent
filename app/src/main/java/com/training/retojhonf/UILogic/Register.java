package com.training.retojhonf.UILogic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.training.retojhonf.R;

public class Register extends AppCompatActivity {

    EditText fullname, email, password, confirmPass, securityQuetion1, answerQ1,securityQuetion2, answerQ2;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fullname = findViewById(R.id.etName);
        email = findViewById(R.id.etEmail);
        password = findViewById(R.id.etPassword);
        confirmPass = findViewById(R.id.etConfirmPassword);
        securityQuetion1 = findViewById(R.id.security_question_1);
        answerQ1 = findViewById(R.id.security_answer_1);
        securityQuetion2 = findViewById(R.id.security_question_2);
        answerQ2 = findViewById(R.id.security_answer_2);
        registerButton = findViewById(R.id.btnRegister);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí puedes agregar la lógica para registrar al usuario en tu base de datos
                Toast.makeText(Register.this, "Registered Successfully", Toast.LENGTH_SHORT).show();

                Intent goToHome = new Intent(Register.this,Home_out.class);
                startActivity(goToHome);
            }
        });
    }
}