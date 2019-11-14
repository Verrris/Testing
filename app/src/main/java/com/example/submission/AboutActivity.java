package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class AboutActivity extends AppCompatActivity {
    ImageView imgPhotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        imgPhotos = findViewById(R.id.img_item_photos);

        Glide.with(this)
                .load("https://images.gr-assets.com/users/1481769282p8/62550231.jpg")
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(imgPhotos);
    }
}
