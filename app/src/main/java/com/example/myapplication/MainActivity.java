package com.example.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public Context context;
    private int counter = 0;
    public Button counterButton;
    public TextView message;
    public Button redButton;
    public Button yellowButton;
    public Button greenButton;
    public ImageView redImage;
    public ImageView yellowImage;
    public ImageView greenImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message = findViewById(R.id.messageText);
        counterButton = findViewById(R.id.buttonId);
        redButton = findViewById(R.id.buttonRed);
        yellowButton = findViewById(R.id.buttonYellow);
        greenButton = findViewById(R.id.buttonGreen);
        redImage = findViewById(R.id.imageRed);
        yellowImage = findViewById(R.id.imageYellow);
        greenImage = findViewById(R.id.imageGreen);
        counterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                message.setText("You pressed the button " + counter + "Times!");
            }
        });
        redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (redImage.getVisibility() == View.INVISIBLE)
                    redImage.setVisibility(View.VISIBLE);
                else
                    redImage.setVisibility(View.INVISIBLE);
            }
        });
        yellowButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (yellowImage.getVisibility() == View.INVISIBLE)
                    yellowImage.setVisibility(View.VISIBLE);
                else
                    yellowImage.setVisibility(View.INVISIBLE);
            }
        });
        greenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (greenImage.getVisibility() == View.INVISIBLE)
                    greenImage.setVisibility(View.VISIBLE);
                else
                    greenImage.setVisibility(View.INVISIBLE);
            }
        });
    }
}