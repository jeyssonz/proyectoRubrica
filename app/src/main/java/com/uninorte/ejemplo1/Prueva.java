package com.uninorte.ejemplo1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Prueva extends AppCompatActivity {
    boolean sw=false;
    MediaPlayer mp,cli;
    Button Mu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        mp = MediaPlayer.create(this, R.raw.clik);
        cli = MediaPlayer.create(this, R.raw.clik1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sw==false)
                {
                    sw=true;
                    mp.start();
                }
                else {
                    if (sw = true) {
                        sw = false;
                        mp.pause();
                    }
                }

                Snackbar.make(view, "Este es el botton de musica", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_prueva, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Rubrica(View view) {
        cli.start();
        Intent i = new Intent(this, Rubrica.class);
        startActivity(i);

    }

    public void Curso(View view) {
        cli.start();
        Intent i = new Intent(this, Cursos.class);
        startActivity(i);
    }

    public void Estudiante(View view) {
        cli.start();
        Intent i = new Intent(this, Estudiante.class);
        startActivity(i);
    }
    public void Musica(View view) {

    }
}
