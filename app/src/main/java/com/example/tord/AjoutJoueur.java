package com.example.tord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class AjoutJoueur extends AppCompatActivity   {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ajout_joueur);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(v ->{
            Intent i = new Intent(this, PlateauJeu.class);
            startActivity(i);

        });

    }




}