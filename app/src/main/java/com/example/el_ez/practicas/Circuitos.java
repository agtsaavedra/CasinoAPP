package com.example.el_ez.practicas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Circuitos extends AppCompatActivity {
Button FSA;
Button EERR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuitos);

        EERR = (Button)findViewById(R.id.btnEERR);
        EERR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EERR = new Intent(Circuitos.this,EERR.class);
                startActivity(EERR);
            }
        });

        FSA = (Button)findViewById(R.id.btnFSA);
        FSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FSA = new Intent(Circuitos.this,FSA.class);
                startActivity(FSA);
            }
        });
    }
}
