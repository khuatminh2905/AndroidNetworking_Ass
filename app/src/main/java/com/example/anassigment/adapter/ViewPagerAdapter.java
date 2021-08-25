package com.example.anassigment.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.anassigment.model.Photo;
import com.example.anassigment.PhotoDetailFragment;

import java.util.List;

public class ViewPagerAdapter extends FragmentStateAdapter {
    List<Photo> photoList;
    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public void setData(List<Photo> photoList) {
        this.photoList = photoList;
        notifyDataSetChanged();
    }

    @Override
    public Fragment createFragment(int position) {
        return PhotoDetailFragment.getInstance(photoList.get(position));
    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }
}
