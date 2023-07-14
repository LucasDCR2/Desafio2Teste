package com.example.desafio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonContinue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View p) {

                abrirProximaActivity();
            }
        });
    }

    private void abrirProximaActivity() {
        EditText editTextName = findViewById(R.id.editTextName);
        String nome = editTextName.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("nome", nome);
        startActivity(intent);
    }

}
