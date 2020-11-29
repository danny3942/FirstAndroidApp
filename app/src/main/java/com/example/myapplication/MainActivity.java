package com.example.myapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;
    private TextView message = findViewById(R.id.messageText);
    private Button counterButton = findViewById(R.id.buttonId);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                message.setText("You pressed the button " + counter + "Times!");
            }
        });
    }
}