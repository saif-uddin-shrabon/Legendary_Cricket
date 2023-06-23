package com.lc.legendarycricket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class historydetails extends AppCompatActivity {

    TextView title,details;
    ImageView photo;
    ImageView imgback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historydetails);

        title = findViewById(R.id.textView_history);
        photo = findViewById(R.id.imageView_history);
        details = findViewById(R.id.details_history);
        imgback = findViewById(R.id.arraw8);



        String name = getIntent().getExtras().getString("name","defaultKey");
        String detail = getIntent().getExtras().getString("details","defaultKey");

        if(getIntent().hasExtra("byteArray")) {
            Bitmap bitmap = BitmapFactory.decodeByteArray(
                    getIntent().getByteArrayExtra("byteArray"), 0, getIntent().getByteArrayExtra("byteArray").length);
            photo.setImageBitmap(bitmap);
        }
        title.setText(name);
        details.setText(detail);


        imgback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(historydetails.this,history.class));
                Animatoo.INSTANCE.animateSwipeLeft(historydetails.this);
                finish();
            }
        });




    }
}