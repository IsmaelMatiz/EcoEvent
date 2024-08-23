package com.training.retojhonf.UILogic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.training.retojhonf.R;

public class Home_in  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_in);

        Button eventButton = findViewById(R.id.event_button);
        Button categoryButton = findViewById(R.id.category_button);
        Button statisticsButton = findViewById(R.id.statistics_button);



        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aquí puedes agregar la lógica para el evento del botón
                startActivity(new Intent(Home_in.this, Event.class));
            }
        });

        categoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aquí puedes agregar la lógica para el evento del botón
                startActivity(new Intent(Home_in.this, Category.class));
            }
        });

        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aquí puedes agregar la lógica para el evento del botón
                startActivity(new Intent(Home_in.this, Statistics.class));
            }
        });
    }
}
