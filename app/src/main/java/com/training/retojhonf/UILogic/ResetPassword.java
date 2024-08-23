package com.training.retojhonf.UILogic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.training.retojhonf.R;

public class ResetPassword extends AppCompatActivity {

    EditText otp, newPassword;
    Button resetPasswordButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        otp = findViewById(R.id.otp);
        newPassword = findViewById(R.id.new_password);
    }

}