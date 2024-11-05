package com.example.baitaplon;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
DatePicker datePicker;
TextView selectedDate;
Button btn_event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        selectedDate = findViewById(R.id.textViewDate);
        datePicker = findViewById(R.id.datePicker);
        btn_event = findViewById(R.id.btn_event);

        btn_event.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent event = new Intent(MainActivity.this, com.example.baitaplon.event.class);
                startActivities(new Intent[]{event});
            }
        });
    }
}

