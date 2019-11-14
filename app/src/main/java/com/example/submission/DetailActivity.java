package com.example.submission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    public static String EXTRA_HERO = "hero";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Hero heroreceived = getIntent().getParcelableExtra("key");

        ImageView photo = findViewById(R.id.img_item_photo);
        TextView name = findViewById(R.id.tv_item_name);
        TextView detail = findViewById(R.id.tv_item_detail);
        TextView desc = findViewById(R.id.tv_item_desc);

        Glide.with(this).load(heroreceived.getPhoto()).apply(new RequestOptions().override(350 , 550)).into(photo);
        name.setText(heroreceived.getName());
        desc.setText(heroreceived.getDetail());
    }
}
