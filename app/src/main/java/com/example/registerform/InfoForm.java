package com.example.registerform;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoForm extends AppCompatActivity {
    User user;
    TextView txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_form);

        user = (User) getIntent().getSerializableExtra("key");
        txt = findViewById(R.id.txtInfor);
        String userData = "Name: " + user.getName() +"\n"+ "Age: "+ user.getAge()+ "\n" +"Phone number: " + user.getPhoneNum()+ "\n"
                + "sport: "+user.getSport()+"\n"
                + "Gender: "+user.getSex()+"\n"
                + "Graduation:  "+user.getGrade()+"\n"
                + "Music :"+user.getMusic();
        txt.setText(userData);
    }
}