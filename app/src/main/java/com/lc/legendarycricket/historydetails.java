package com.lc.legendarycricket;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class historydetails extends AppCompatActivity {

    TextView title,details;
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historydetails);

        title = findViewById(R.id.textView_history);
        photo = findViewById(R.id.imageView_history);
        details = findViewById(R.id.details_history);


        String name = getIntent().getExtras().getString("name","defaultKey");
        String detail = getIntent().getExtras().getString("details","defaultKey");

        if(getIntent().hasExtra("byteArray")) {
            Bitmap bitmap = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra("byteArray"), 0, getIntent().getByteArrayExtra("byteArray").length);
            photo.setImageBitmap(bitmap);
        }
        title.setText(name);
        details.setText(detail);


    }
}