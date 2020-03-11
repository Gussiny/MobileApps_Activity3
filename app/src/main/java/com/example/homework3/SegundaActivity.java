package com.example.homework3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView txtNombre, txtVacio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        txtNombre = findViewById(R.id.txtNombre);
        txtVacio = findViewById(R.id.txtVacio);

        Intent intentoAnterior = getIntent();

        txtNombre.setText("Hi "  + intentoAnterior.getStringExtra("nombre"));
    }

    public void Hobbies(View v){
        Intent hobbies =  new Intent(this, HobbieActivity.class);
        startActivityForResult(hobbies, 0);
    }

    public void Friends(View v){
        Intent friends = new Intent(this, FriendsActivity.class);
        startActivity(friends);
    }

    public void Message(View v){
        Intent message = new Intent(this, MessageActivity.class);
        startActivity(message);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0 && resultCode == Activity.RESULT_OK){
            txtVacio.setText(data.getStringExtra("hobbie"));
        }
    }
}
