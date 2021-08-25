package com.example.anassigment.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anassigment.R;

public class PhotoViewHolder extends RecyclerView.ViewHolder {
    public ImageView photoItem;
    public TextView tvItem;
    public View view;
    public LinearLayout layout;

    public PhotoViewHolder(@NonNull View itemView) {
        super(itemView);
        view = itemView;
        photoItem = itemView.findViewById(R.id.item_photo);
        tvItem = itemView.findViewById(R.id.item_tv);
        layout = itemView.findViewById(R.id.linear_layout_item);
    }
}
