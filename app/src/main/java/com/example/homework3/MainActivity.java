package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button botoncito;
    private TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botoncito = findViewById(R.id.btnActivity);
        nombre = findViewById(R.id.lblNombre);
    }


    public void changeActivity(View v){
        Intent intentito = new Intent(this, SegundaActivity.class);
        intentito.putExtra("nombre", nombre.getText().toString());
        startActivity(intentito);
    }


}
