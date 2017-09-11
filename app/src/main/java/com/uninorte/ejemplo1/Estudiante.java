package com.uninorte.ejemplo1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Estudiante extends AppCompatActivity {
    LinearLayout main;
    MediaPlayer cli;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiante);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        main=(LinearLayout) findViewById(R.id.MEstudiantes);
        count=1;
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        cli = MediaPlayer.create(this, R.raw.clik1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cli.start();
                generateLayout();
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                      //  .setAction("Action", null).show();
            }
        });
    }


    private void generateLayout() {
        LinearLayout newLayout = new LinearLayout(this);
        newLayout.setOrientation(LinearLayout.VERTICAL);
        TextView tv = new TextView(this);
        EditText et = new EditText(this);
        Button bt = new Button(this);
        bt.setText("Agregar Estudiante"+count);
        bt.setTag(count);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LayoutGeneratorLog","El boton "+view.getTag());
            }
        });
        tv.setText("  Ingrese el nombre del Estudiante");

        newLayout.addView(tv);
        newLayout.addView(et);
        newLayout.addView(bt);
        main.addView(newLayout);
        count++;
    }
    public void Home(View view) {
        Intent i = new Intent(this, Prueva.class);
        startActivity(i);
    }

    public void CreaEst(View view) {
        Home(view);
    }
}
