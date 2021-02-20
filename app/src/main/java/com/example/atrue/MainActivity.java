package com.example.atrue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void diminuer(View view) {
        EditText number = (EditText) findViewById(R.id.editTextNumber);
        number.setText("editTextNumber" - 1 );
    }

    public void augementer(View view) {
        EditText number = (EditText) findViewById(R.id.editTextNumber);
        number.setText("editTextNumber" + 1 );
    }
}
