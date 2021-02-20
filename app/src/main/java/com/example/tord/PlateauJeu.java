package com.example.tord;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class PlateauJeu extends AppCompatActivity {
    ImageView bouteil;
    Button btn;
    Random r;
    boolean restart=false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plateaujeu);


        bouteil = (ImageView) findViewById(R.id.bouteil);
        bouteil.setOnClickListener(v -> {
                    Intent i = new Intent(this, Question.class);
                    startActivity(i);

                });






            r=new Random();
        bouteil = (ImageView)findViewById(R.id.bouteil);
        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int angle = 0;
                if(restart){
                    angle = angle % 360;
                    RotateAnimation rotate = new RotateAnimation (angle, 360,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF,  0.5f);
                    rotate.setFillAfter(true);
                    rotate.setDuration(1000);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    bouteil.startAnimation(rotate);
                    btn.setText("Go");
                    restart=false;
                }
                else{
                    angle = r.nextInt() + 360;
                    RotateAnimation rotate = new RotateAnimation (0,angle,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF,  0.5f);
                    rotate.setFillAfter(true);
                    rotate.setDuration(3600);
                    rotate.setInterpolator(new AccelerateDecelerateInterpolator());
                    bouteil.startAnimation(rotate);
                    btn.setText("Restart");
                    restart=true;
                }
            }
        });
    }
}