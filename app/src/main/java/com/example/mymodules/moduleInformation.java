package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class moduleInformation extends AppCompatActivity {
    TextView tvModule;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_information);
        tvModule = findViewById(R.id.tvModule);
        back = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String moduleCode = intentReceived.getStringExtra("Module");
        String moduleName = "";
        String year = "";
        String semester = "";
        String credit = "";
        String venue = "";
        if(moduleCode.equals("C099")){
            moduleName = "ABC Progamming";
            year = "2021";
             semester = "1";
             credit = "4";
             venue = "W66M";
        }else if(moduleCode.equals("C100")){
             moduleName = "ABC Designing";
             year = "2021";
             semester = "1";
             credit = "2";
             venue = "W44A";
        }else if(moduleCode.equals("C101")){
             moduleName = "ABC Workout";
             year = "2021";
             semester = "1";
             credit = "4";
             venue = "W23A";
        }else if(moduleCode.equals("C102")){
             moduleName = "ABC Security";
             year = "2021";
             semester = "1";
             credit = "4";
             venue = "E23E";
        }else if(moduleCode.equals("C103")){
             moduleName = "ABC UIUX";
             year = "2021";
             semester = "1";
             credit = "4";
             venue = "E42G";
        }else {
             moduleName = "ABC Android";
             year = "2021";
             semester = "1";
             credit = "4";
             venue = "W71C";
        }
        tvModule.setText(String.format("Module Code: %s\nModule Name: %s\nAcademic Year: %s\nSemester: %s\nModule Credit: %s\nVenue: %s\n",moduleCode,moduleName,year,semester,credit,venue));

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(moduleInformation.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}