package com.example.trueordare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_cnx;
    TextView tv_ins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*btn_cnx = (Button) findViewById(R.id.button2);
        tv_ins = (TextView) findViewById(R.id.editTextTextPersonName2);
        btn_cnx.setOnClickListener(this);
        tv_ins.setOnClickListener(this);*/

    }

    @Override
    public void onClick(View v) {

    }
}