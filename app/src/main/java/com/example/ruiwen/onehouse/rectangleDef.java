package com.example.ruiwen.onehouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import static java.lang.Double.*;

public class rectangleDef extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle_def);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        descText();
        clickButton();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void descText(){
        TextView desc = (TextView) findViewById(R.id.descText);
        Geometry geo = new Geometry();
        desc.setText(geo.AreaRect());
    }

    public void clickButton(){
        Button calBut = (Button) findViewById(R.id.button2);
        final EditText area = (EditText) findViewById(R.id.area);
        final EditText height = (EditText) findViewById(R.id.height);
        final EditText base = (EditText) findViewById(R.id.base);
        final Geometry geo = new Geometry();
        calBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(area.length() == 0){
                    if (height.length() != 0 && base.length() != 0) {
                        area.setText(valueOf(geo.getAreaRect(valueOf(base.getText().toString()), valueOf(height.getText().toString()))).toString());
                    }
                }
                if(height.length() == 0 && area.length() != 0 && base.length() != 0){
                    height.setText(valueOf(geo.getHeightRect(valueOf(area.getText().toString()), valueOf(base.getText().toString()))).toString());
                }
                if(base.length() == 0 && area.length() != 0 && height.length() != 0){
                    base.setText(valueOf(geo.getBaseRect(valueOf(area.getText().toString()), valueOf(height.getText().toString()))).toString());
                }
            }
        });
    }
}
