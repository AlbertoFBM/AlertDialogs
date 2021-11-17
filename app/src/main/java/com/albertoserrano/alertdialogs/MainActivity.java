package com.albertoserrano.alertdialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickAlertDialog(view);
            }
        });
    }

    private void clickAlertDialog(View v){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.create();

        builder.setTitle("EXIT");

        builder.setMessage("¿Seguro que quieres salir?");

        builder.setPositiveButton("Aceptar", null);

        builder.setNegativeButton("Cancelar", null);

        builder.show();
    }
}