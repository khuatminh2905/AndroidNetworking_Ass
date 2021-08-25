package com.example.anassigment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.anassigment.adapter.PhotoAdapter;
import com.example.anassigment.adapter.ViewPagerAdapter;
import com.example.anassigment.model.Photos;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    ViewPagerAdapter viewPagerAdapter;
    Photos photos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager2 = findViewById(R.id.view_pager_2);
        viewPagerAdapter = new ViewPagerAdapter(ViewPagerActivity.this);

        photos = (Photos) getIntent().getExtras().get("photoList");

        viewPagerAdapter.setData(photos.getPhotoList());
        viewPager2.setAdapter(viewPagerAdapter);
        viewPager2.setCurrentItem(PhotoAdapter.photoPosition);
    }
}