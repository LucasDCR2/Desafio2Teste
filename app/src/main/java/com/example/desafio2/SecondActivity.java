package com.example.desafio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String nome = getIntent().getStringExtra("nome");

        TextView editTextName = findViewById(R.id.editTextName);
        editTextName.setText("Seja Bem-vindo " + nome);

        Button buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltarFirstActivity();
            }
        });
    }

    private void voltarFirstActivity() {
        Intent intent = new Intent (this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}