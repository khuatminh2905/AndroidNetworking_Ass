package com.example.anassigment.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.anassigment.model.Photo;
import com.example.anassigment.model.Photos;
import com.example.anassigment.R;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoViewHolder> {
    private Photos photos;
    private List<Photo> photoList;
    Context context;
    private OnItemClickListener onItemClickListener;

    //Tao 1 vi tri cho anh
    public static int photoPosition;
    public PhotoAdapter(Context context) {
        this.context = context;
    }

    public void setData(List<Photo> photoList, Photos photos, OnItemClickListener onItemClickListener) {
        this.photoList = photoList;
        this.photos = photos;
        this.onItemClickListener = onItemClickListener;
        notifyDataSetChanged();
    }

    @Override
    public PhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new PhotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoViewHolder holder, int position) {
        final Photo photo = photoList.get(position);

        if (photo.getUrl_s() == null) {
            return;
        }

        //Set photo
        Glide.with(context).load(photo.getUrl_s()).into(holder.photoItem);
//        int width  = Resources.getSystem().getDisplayMetrics().widthPixels;
//        int height = Resources.getSystem().getDisplayMetrics().heightPixels;
//        holder.photoItem.getLayoutParams().height = height / 4;

        //Set text
        holder.tvItem.setText(photo.getViews());

        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Lay vi tri cua anh de truyen sang
                photoPosition = position;
                photos.setPhotoList(photoList);
                onItemClickListener.onItemClick(photos);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (photoList != null) {
            return photoList.size();
        }
        return 0;
    }

}
