package com.mdazizulhakim.worldsbestplacestovisit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceDetails extends AppCompatActivity {

    ActionBar actionBar;

    TextView txtHeding,txtDetails1,txtDetails2;
    ImageView imgPlace1,imgPlace2;
    Button btnMore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_details);

        actionBar = getSupportActionBar();

        txtHeding = (TextView) findViewById(R.id.txtHeading);
        txtDetails1 = (TextView) findViewById(R.id.txtDetails1);
        txtDetails2 = (TextView) findViewById(R.id.txtDetails2);

        imgPlace1 = (ImageView) findViewById(R.id.imgPlace1);
        imgPlace2 = (ImageView) findViewById(R.id.imgPlace2);

        btnMore = (Button) findViewById(R.id.btnMore);

        String getPlace = getIntent().getExtras().getString("Place");

        if (getPlace.equals("Great Barrier Reef")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Great Barrier Reef,Australia");
            txtDetails1.setText(R.string.reef1);
            txtDetails2.setText(R.string.reef2);

            imgPlace1.setImageResource(R.drawable.reef1);
            imgPlace2.setImageResource(R.drawable.reef2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://travel.usnews.com/Great_Barrier_Reef_Australia/"));
                    startActivity(intent);
                }
            });
        }

        if (getPlace.equals("Paris")){

            actionBar.setTitle(getPlace);
            txtHeding.setText("Paris,France");
            txtDetails2.setText(R.string.paris2);
            txtDetails1.setRawInputType(R.string.paris2);

            imgPlace1.setImageResource(R.drawable.paris1);
            imgPlace2.setImageResource(R.drawable.paris2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Paris_France/"));
                    startActivity(intent);
                }
            });


        }

        if (getPlace.equals("Bora Bora")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Bora Bora Island");
            txtDetails1.setText(R.string.bora);
            txtDetails2.setText("");
            imgPlace1.setImageResource(R.drawable.borabora1);
            imgPlace2.setImageResource(R.drawable.borabora2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Bora_Bora/"));
                    startActivity(intent);
                }
            });
        }

        if (getPlace.equals("Florence")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Florance,Italy");
            txtDetails1.setText(R.string.florence);
            txtDetails2.setText("");
            imgPlace1.setImageResource(R.drawable.florence1);
            imgPlace2.setImageResource(R.drawable.florence2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Florence_Italy/"));
                    startActivity(intent);
                }
            });
        }

        if (getPlace.equals("Tokyo")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Tokyo,Japan");
            txtDetails1.setText(R.string.tokyo1);
            txtDetails2.setText(R.string.tokyo2);

            imgPlace1.setImageResource(R.drawable.japan1);
            imgPlace2.setImageResource(R.drawable.japan2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Tokyo_Japan/"));
                    startActivity(intent);
                }
            });
        }

        if (getPlace.equals("Rome")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Rome,Italy");
            txtDetails1.setText(R.string.Rome);
            txtDetails2.setText("");
            imgPlace1.setImageResource(R.drawable.rome1);
            imgPlace2.setImageResource(R.drawable.rome2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Rome_Italy/"));
                    startActivity(intent);
                }
            });
        }

        if (getPlace.equals("Cape Town")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Cape Town,South Africa");
            txtDetails1.setText(R.string.cape);
            txtDetails2.setText("");
            imgPlace1.setImageResource(R.drawable.capetown1);
            imgPlace2.setImageResource(R.drawable.capetown2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Cape_Town_South_Africa/"));
                    startActivity(intent);
                }
            });
        }

        if (getPlace.equals("Barcelona")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Barcelona,Spain");
            txtDetails1.setText(R.string.bercelona);
            txtDetails2.setText("");
            imgPlace1.setImageResource(R.drawable.borabora1);
            imgPlace2.setImageResource(R.drawable.borabora2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Barcelona_Spain/"));
                    startActivity(intent);
                }
            });
        }

        if (getPlace.equals("Amsterdam")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Amsterdam,Netherlands");
            txtDetails1.setText(R.string.amst);
            txtDetails2.setText("");
            imgPlace1.setImageResource(R.drawable.amsterdam1);
            imgPlace2.setImageResource(R.drawable.amsterdam2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Amsterdam_Netherlands/"));
                    startActivity(intent);
                }
            });
        }

        if (getPlace.equals("Cairo")){
            actionBar.setTitle(getPlace);
            txtHeding.setText("Cairo,Egypet");
            txtDetails1.setText(R.string.cairo);
            txtDetails2.setText("");
            imgPlace1.setImageResource(R.drawable.cairo1);
            imgPlace2.setImageResource(R.drawable.cairo2);

            btnMore.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://travel.usnews.com/Cairo_Egypt/"));
                    startActivity(intent);
                }
            });
        }


    }
}
