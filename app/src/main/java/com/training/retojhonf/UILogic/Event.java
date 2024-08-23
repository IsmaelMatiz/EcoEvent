package com.training.retojhonf.UILogic;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.training.retojhonf.R;

import java.util.Calendar;

public class Event extends AppCompatActivity {

    EditText eventName, auxiliaryCount, eventGoal;
    Spinner citySpinner, eventTypeSpinner, goalAchieved;
    ProgressBar progressBar;
    Button calendarButton, listEventsButton, saveEventButton;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        eventName = findViewById(R.id.event_name);
        auxiliaryCount = findViewById(R.id.auxiliary_count);
        eventGoal = findViewById(R.id.event_goal);
        citySpinner = findViewById(R.id.city_spinner);
        eventTypeSpinner = findViewById(R.id.event_type_spinner);
        goalAchieved = findViewById(R.id.target_completed_spinner);
        calendarButton = findViewById(R.id.calendar_button);
        saveEventButton = findViewById(R.id.save_event_button);
        calendar = Calendar.getInstance();

        calendarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(Event.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        calendar.set(year, month, dayOfMonth);
                        Toast.makeText(Event.this, "Fecha seleccionada: " + dayOfMonth + "/" + (month + 1) + "/" + year, Toast.LENGTH_SHORT).show();
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        saveEventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = eventName.getText().toString().trim();
                String auxiliaries = auxiliaryCount.getText().toString().trim();
                String city = citySpinner.getSelectedItem().toString();
                String eventType = eventTypeSpinner.getSelectedItem().toString();
                String goal = eventGoal.getText().toString().trim();
                //boolean isGoalAchieved = goalAchiev+ed.isChecked();
                int progress = progressBar.getProgress();

                // Aquí puedes agregar la lógica para guardar el evento
                Toast.makeText(Event.this, "Evento guardado: " + name, Toast.LENGTH_SHORT).show();
            }
        });
    }
}