package com.example.ruiwen.onehouse;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.list;

public class thridLevelGeometry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid_level_geometry);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mainList();
        clickmainList();
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void mainList(){
        String[] mainList = {"Area of Rectangle","Area of Triangle","Area of Circle", "Circumference of a Circle", "Volume of Rectangle Solid", "Volume of Cylinder", "Surface area of Cylinder", "Volume of a Sphere"};
        ArrayAdapter<String> list = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,mainList);
        ListView list1 = (ListView) findViewById(R.id.list03);
        list1.setAdapter(list);
    }

    public void clickmainList(){
        ListView list1 = (ListView) findViewById(R.id.list03);
        list1.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                String message = "Formula for " + textView.getText().toString();
                Toast.makeText(thridLevelGeometry.this, message, Toast.LENGTH_SHORT).show();
                if (position == 0){
                    Intent i = new Intent(thridLevelGeometry.this, rectangleDef.class);
                    startActivity(i);
                }
                if (position == 1){
                    Intent i = new Intent(thridLevelGeometry.this, seconLevelPhysics.class);
                    startActivity(i);
                }
            }
        });
    }
}
