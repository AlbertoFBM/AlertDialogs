package com.albertoserrano.alertdialogs;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                aceptar();
            }
        });

        builder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                cancelar();
            }
        });

        builder.show();
    }

    private void aceptar(){

        finish();

    }

    private void cancelar(){

        TextView tCancelar = findViewById(R.id.textView);

        tCancelar.setText("Gracias por no pulsar ACEPTAR");

    }
}