package com.mdazizulhakim.worldsbestplacestovisit;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView PlaceList;

    String Placedata[] = {"Great Barrier Reef", "Paris", "Bora Bora", "Florence", "Tokyo", "Rome", "Cape Town", "Barcelona", "Amsterdam", "Cairo"};

    int Icon[] = {R.drawable.headreef, R.drawable.headparis, R.drawable.headbora, R.drawable.headflorence, R.drawable.headtokoyo, R.drawable.headrome, R.drawable.headcape, R.drawable.headbercelona, R.drawable.headamset, R.drawable.headcairo};

    ImageView animationplayer;
    AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlaceList = (ListView) findViewById(R.id.placeList);


        PlaceList.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = event.getAction();
                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        // Disallow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        // Allow ScrollView to intercept touch events.
                        v.getParent().requestDisallowInterceptTouchEvent(false);
                        break;
                }

                // Handle ListView touch events.
                v.onTouchEvent(event);
                return true;
            }
        });


        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), Placedata, Icon);
        PlaceList.setAdapter(customAdapter);

        PlaceList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, Placedata[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, PlaceDetails.class);
                intent.putExtra("Place", Placedata[position]);
                startActivity(intent);

            }
        });

        animationplayer = (ImageView) findViewById(R.id.imgAnimation);

        animationplayer.setImageResource(R.drawable.animation);
        animation = (AnimationDrawable) animationplayer.getDrawable();
        animation.start();

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
