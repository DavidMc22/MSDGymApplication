package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Variable
    private Button button;
    private Button locationbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Setting variable = to specific Ids
        button = (Button) findViewById(R.id.MainMenu);
        locationbtn =(Button) findViewById(R.id.location);

        //Using OnClickListener to ser the button to open main menu page
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMainMenu();
            }
        });

        locationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocation();
            }
        });
    }

    //Using an Intent to open the main menu page
    public void openMainMenu(){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

    public void openLocation(){
        Intent intent2 = new Intent(this,
                MapLocation.class);
        startActivity(intent2);
    }
}