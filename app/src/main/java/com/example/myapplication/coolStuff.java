package com.example.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;


public class coolStuff extends Fragment {
    protected Context context;
    protected Button hellow;
    protected NavController navController;
    protected NavHostFragment navHostFragment;
    public class MainActivity extends AppCompatActivity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
            context = this;
            super.onCreate(savedInstanceState);
            setContentView(R.layout.fragment_cool_stuff);
            hellow = findViewById(R.id.hellow);
            hellow.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    navHostFragment = FragmentManager.findFragment(v);
                    navController = navHostFragment.getNavController();
                    navController.navigate(R.id.action_coolStuff2_to_mainActivity3);
                }
            });
        }
    }
}