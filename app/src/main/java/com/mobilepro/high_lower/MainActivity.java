package com.mobilepro.high_lower;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void randomNumberGenerator()
    {
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }
    public void onNebak(View view)
    {
        String message = "";

        try {

            EditText editTextNumber = (EditText) findViewById(R.id.edtnumber);
            int angkaDitebak = Integer.parseInt(editTextNumber.getText().toString());

            if(angkaDitebak < randomNumber && angkaDitebak <=20) {
                message = "Angka Lebih Tinggi !!";
            }
            else if(angkaDitebak > randomNumber && angkaDitebak <=20) {
                message = "Angka Lebih Rendah !!";
            }
            else if (angkaDitebak == randomNumber)
            {
                message="You got me !!";
                randomNumberGenerator();
            }

            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
        catch(Exception e) {
            Toast.makeText(this, "Masukkan Harus Angka!!!", Toast.LENGTH_SHORT).show();
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;    //limit upto 20 from 1
    }
}