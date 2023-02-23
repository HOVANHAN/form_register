package com.example.registerform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView name,age;
    EditText phoneNume;
    SeekBar seekBar;
    CheckBox sport;
    Spinner graduate;
    List<String> item;
    Switch sex;
    User user;
    RadioButton rap,pop;
    Button register, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        age = findViewById(R.id.ageTxt);
        seekBar = findViewById(R.id.seekBar);
        sex = findViewById(R.id.sexSwitch);
        sport = findViewById(R.id.checkBox);
        rap = findViewById(R.id.radioButton);
        pop = findViewById(R.id.radioButton2);
        phoneNume = findViewById(R.id.editTextPhone);
        name = findViewById(R.id.name);
        graduate = findViewById(R.id.spinner);
//
//        item = new ArrayList<>();
//        item.add("university");
//        item.add("college");
//        graduate.setAdapter(new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, item));
        String[] values = new String[]{"College", "University", "Postgraduate"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, values);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        graduate.setAdapter(adapter);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                age.setText("" + i );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        register = findViewById(R.id.btnRegister    );
        cancel = findViewById(R.id.btnCancle);
        user = new User();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user.setName(name.getText().toString());
                user.setAge(Integer.parseInt(age.getText().toString()));
                user.setPhoneNum(Integer.parseInt(phoneNume.getText().toString()));
                if(sex.isChecked())
                {
                    user.setSex("Male");
                }else
                    user.setSex("Female");
                if(sport.isChecked())
                    user.setSport("Have");
                else
                    user.setSport("None");
                user.setGrade(graduate.getSelectedItem().toString());
                if(pop.isChecked())
                    user.setMusic("Pop");
                else
                    user.setMusic("Rap");

                Intent intent = new Intent(MainActivity.this,InfoForm.class);
                intent.putExtra("key",user);
                startActivity(intent);

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                age.setText("0");
                phoneNume.setText("");
                sport.setChecked(false);
                pop.setChecked(false);
                rap.setChecked(false);


            }
        });



    }

}