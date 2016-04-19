package com.example.sunny.ratehubplus;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends Activity implements View.OnClickListener{

    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        back = (ImageView) findViewById(R.id.back_button);
        back.setOnClickListener(this);

        ListView listview = (ListView) findViewById(R.id.list_view);
        String[] values = new String[]{"Swiss Chalet", "Norm's Pub & Grill", "MacDonalds", "Taco Bell",
                "Wendy's", "Arby's", "Victory Buffet", "Sitara", "Boston Pizza", "Cosmo's Tavern"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.restaurant_row, values);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
               // Toast.makeText(Main2Activity.this, "List View row Clicked at" + position, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Main2Activity.this,DishCategory.class);

                startActivity(i);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main2Activity.this, MapsActivity.class);
                startActivity(i);
            }
        });

    }
    @Override
    public void onClick(View v) {
        Intent i = new Intent(Main2Activity.this,RestaurantType.class);
        startActivity(i);

    }
}
