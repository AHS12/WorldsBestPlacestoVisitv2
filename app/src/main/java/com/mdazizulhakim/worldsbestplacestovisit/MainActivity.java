package com.mdazizulhakim.worldsbestplacestovisit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView PlaceList;

    String Placedata[] = {"Great Barrier Reef","Paris","Bora Bora","Florence","Tokyo","Rome","Cape Town","Barcelona","Amsterdam","Cairo"};

     int Icon[] = {R.drawable.headreef,R.drawable.headparis,R.drawable.headbora,R.drawable.headflorence,R.drawable.headtokoyo,R.drawable.headrome,R.drawable.headcape,R.drawable.headbercelona,R.drawable.headamset,R.drawable.headcairo};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlaceList = (ListView) findViewById(R.id.placeList);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),Placedata,Icon);
        PlaceList.setAdapter(customAdapter);

        PlaceList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,Placedata[position],Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,PlaceDetails.class);
                intent.putExtra("Place",Placedata[position]);
                startActivity(intent);

            }
        });

      /*  PlaceList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this,Placedata[position],Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,PlaceDetails.class);
                intent.putExtra("Place",Placedata[2]);
                intent.putExtra("PlaceDetils","paris");
                startActivity(intent);

            }
        }); */
    }
}
