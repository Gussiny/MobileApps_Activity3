package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class HobbieActivity extends AppCompatActivity {

    private EditText hobbie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbie);
        hobbie = findViewById(R.id.lblHobbie);
    }

    public void regresar(View v){
        Intent backIntent = new Intent();

        backIntent.putExtra("hobbie", hobbie.getText().toString());
        setResult(Activity.RESULT_OK, backIntent);
        finish();
    }
}
