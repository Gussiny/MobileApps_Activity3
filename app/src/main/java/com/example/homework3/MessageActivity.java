package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MessageActivity extends AppCompatActivity {

    private EditText mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        mensaje = findViewById(R.id.lblMessage);
    }

    public void sendMessage(View v){
        Toast.makeText(this, "Message sent", Toast.LENGTH_SHORT).show();
        finish();
    }
}