package com.lc.legendarycricket;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class DetailsActivity extends AppCompatActivity {

    TextView pname,pbiograpy,ptotalrun,ptotalmatchplayed,ptestmatched,podi,pt20matches,pachivement;
    ImageView coverphoto;
    ImageView imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        pname = findViewById(R.id.palyerName);
        pbiograpy = findViewById(R.id.playerDetails);
        ptotalrun = findViewById(R.id.totalrun);
        ptotalmatchplayed = findViewById(R.id.totalmathesplayed);
        pachivement= findViewById(R.id.totalmathes);
        podi = findViewById(R.id.odi);
        pt20matches = findViewById(R.id.t20matches);
        pachivement = findViewById(R.id.achivment);
        coverphoto = findViewById(R.id.photo);
        imgback = findViewById(R.id.arraw);


        String playername = getIntent().getExtras().getString("playername","defaultKey");
        String playerBigraphy = getIntent().getExtras().getString("playerBigraphy","playerBigraphy");
        String totralRun = getIntent().getExtras().getString("totralRun","totralRun");
        String totalMatchPlayed = getIntent().getExtras().getString("totalMatchPlayed","totalMatchPlayed");
        String Testmatches = getIntent().getExtras().getString("Testmatches","Testmatches");
        String odi = getIntent().getExtras().getString("odi","odi");
        String t20matches = getIntent().getExtras().getString("t20matches","t20matches");
        String achivement = getIntent().getExtras().getString("achivement","achivement");
        Bitmap bitmap = BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("byteArray"), 0, getIntent().getByteArrayExtra("byteArray").length);


        pname.setText(playername);
        pbiograpy.setText(playerBigraphy);
        ptotalrun.setText(totralRun);
        ptotalmatchplayed.setText(totalMatchPlayed);
        podi.setText(odi);
        pt20matches.setText(t20matches);
        pachivement.setText(achivement);
        coverphoto.setImageBitmap(bitmap);
        pachivement.setText(achivement);


        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DetailsActivity.this,deshboard.class));
                Animatoo.INSTANCE.animateSwipeLeft(DetailsActivity.this);
                finish();
            }
        });





    }


}