package com.uninorte.ejemplo1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import static android.R.attr.layout_alignWithParentIfMissing;
import static android.R.attr.scrollbars;
import static android.R.attr.widgetLayout;
import static android.R.attr.width;
import static android.R.attr.windowBackground;

public class Rubrica extends AppCompatActivity {
    LinearLayout main;
    MediaPlayer cli;
    ScrollView Sc;
    int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubrica);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        main=(LinearLayout) findViewById(R.id.CRubb);
        count=1;
        Sc = (ScrollView) findViewById(R.id.Scro);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        cli = MediaPlayer.create(this, R.raw.clik1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cli.start();
                generateLayout();
               // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                 //       .setAction("Action", null).show();

            }
        });
    }

    public void Home(View view) {
        Intent i = new Intent(this, Prueva.class);
        startActivity(i);
    }
   // private void generartitulo(){}
    private void generateLayout() {
        LinearLayout newLayout = new LinearLayout(this);
        newLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout newLayout2 = new LinearLayout(this);
        newLayout2.setOrientation(LinearLayout.HORIZONTAL);
        TextView tv = new TextView(this);
        EditText et = new EditText(this);
        EditText et1 = new EditText(this);
        EditText et2 = new EditText(this);
        EditText et3 = new EditText(this);
        EditText et4 = new EditText(this);
        EditText et5 = new EditText(this);
        Button bt = new Button(this);
        bt.setText("Agregar Estudiante"+count);
        bt.setTag(count);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("LayoutGeneratorLog","El boton "+view.getTag());
            }
        });
        //tv.setText("  Ingrese la nueva categoria");


        et.setHint("Categoria");
        et.setWidth(Sc.getWidth()*2/9+20 );
        et1.setHint(" % ");
        et1.setWidth(Sc.getWidth()/9 );
        et2.setHint("L1");
        et2.setWidth(Sc.getWidth()/6 );
        et3.setHint("L2");
        et3.setWidth(Sc.getWidth()/6 );
        et4.setHint("L3");
        et4.setWidth(Sc.getWidth()/6 );
        et5.setHint("L4");
        et5.setWidth(Sc.getWidth()/6 );

        newLayout.addView(newLayout2);
        newLayout.addView(tv);
        newLayout2.addView(et);
        newLayout2.addView(et1);
        newLayout2.addView(et2);
        newLayout2.addView(et3);
        newLayout2.addView(et4);
        newLayout2.addView(et5);
        // newLayout.addView(bt);

         main.addView(newLayout);
        count++;
    }

    public void CCategoria(View view) {
        Home(view);
    }
}
