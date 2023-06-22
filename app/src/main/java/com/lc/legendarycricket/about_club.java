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

public class about_club extends AppCompatActivity {

    public static ImageView imageView;
    public static TextView textView,details;

    ImageView imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_club);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        details = findViewById(R.id.details);
        imgback = findViewById(R.id.arraw1);
        String name = getIntent().getExtras().getString("name","defaultKey");
        String detail = getIntent().getExtras().getString("details","defaultKey");

        if(getIntent().hasExtra("byteArray")) {
            Bitmap bitmap = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra("byteArray"), 0, getIntent().getByteArrayExtra("byteArray").length);
            imageView.setImageBitmap(bitmap);
        }
        textView.setText(name);
        details.setText(detail);


        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(about_club.this,club.class));
                Animatoo.INSTANCE.animateSwipeLeft(about_club.this);
                finish();
            }
        });

        about_club.this.getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {

                startActivity(new Intent(about_club.this,club.class));
                Animatoo.INSTANCE.animateSwipeLeft(about_club.this);
                finish();

            }
        });


    }
}