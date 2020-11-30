package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.*;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.*;
import androidx.navigation.fragment.NavHostFragment;

public class MainActivity extends AppCompatActivity {
    protected Context context;
    protected LinearLayout helloLayout;
    private int counter = 0;
    public Button counterButton;
    public TextView message;
    public Button redButton;
    public Button yellowButton;
    public Button greenButton;
    public ImageView redImage;
    public ImageView yellowImage;
    public ImageView greenImage;
    public Button navButton;
    protected NavHostFragment navHostFragment;
    public NavController navController;
    protected FragmentManager supportFragmentManager;
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
        helloLayout = findViewById(R.id.helloLayout);
        navButton = findViewById(R.id.navbutton);
        counterButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                counter++;
                message.setText("You pressed the button " + counter + "Times!");
            }
        });
       navButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

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