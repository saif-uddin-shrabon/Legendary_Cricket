package com.lc.legendarycricket;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class about_club extends AppCompatActivity {

    public static ImageView imageView;
    public static TextView textView,details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_club);

        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        details = findViewById(R.id.details);
        String name = getIntent().getExtras().getString("name","defaultKey");
        String detail = getIntent().getExtras().getString("details","defaultKey");

        if(getIntent().hasExtra("byteArray")) {
            Bitmap bitmap = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra("byteArray"), 0, getIntent().getByteArrayExtra("byteArray").length);
            imageView.setImageBitmap(bitmap);
        }
        textView.setText(name);
        details.setText(detail);


    }
}