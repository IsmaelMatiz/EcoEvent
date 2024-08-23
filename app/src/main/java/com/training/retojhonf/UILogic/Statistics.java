package com.training.retojhonf.UILogic;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.training.retojhonf.R;

public class Statistics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_statistics);

        Button btnGoToTips = findViewById(R.id.goto_tips);

        btnGoToTips.setOnClickListener(v -> {
            startActivity(new Intent(Statistics.this, Tips.class));
        });
    }
}