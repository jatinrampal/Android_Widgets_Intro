package com.midterm.rampalj.jatin_midterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView gender;
    TextView pet;
    int gen,pe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender = findViewById(R.id.gender);
        pet = findViewById(R.id.textPet);


    }


    public void radioClick(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        switch(view.getId()) {
            case R.id.rbMale:
                if (checked)
                    gen=0;
                break;

            case R.id.rbFemale:
                if (checked)
                    gen=1;
                break;
            case R.id.rbDog:
                if (checked)
                    pe=0;
                break;
            case R.id.rbCat:
                if (checked)
                    pe=1;
                break;
            case R.id.rbBird:
                if (checked)
                    pe=2;
            case R.id.rbFish:
                if (checked)
                    pe=3;
                break;
        }


    }

    public void btnClicked(View view) {
        if(gen==0)
        {
            gender.setText("Gender:Male");
        }
        else if(gen==1)
        {
            gender.setText("Gender:Female");
        }
        if(pe==0)
        {
            pet.setText("Pet:Dog");
        }
        else if(pe==1)
        {
            pet.setText("Pet:Cat");
        }
        else if(pe==2)
        {
            pet.setText("Pet:Bird");
        }
        else if(pe==3)
        {
            pet.setText("Pet:Fish");
        }

        }



    }

