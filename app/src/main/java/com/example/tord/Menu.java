/*package com.example.tord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class Menu extends AppCompatActivity {
    Button button3;
    Button button5;

        @Override
        protected void  onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(v ->{
        Intent i = new Intent(this, AjoutJoueur.class);
        startActivity(i);
        });}


    public void augmenter( ) {



        var Contenu = textView1.text.toString().toInt();
        Contenu = Contenu + 1;
        textView1.text = Contenu.toString;
        }

    protected void diminuer() {
        var Contenu = textView1.text.toString().toInt();
        if (Contenu > 0) {
        Contenu = Contenu - 1;
        }
        textView1.text = Contenu.toString;
        }
        }


*/

