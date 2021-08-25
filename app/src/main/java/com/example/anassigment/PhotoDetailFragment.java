package com.example.anassigment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.anassigment.model.Photo;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.squareup.picasso.Picasso;

import java.util.UUID;

public class PhotoDetailFragment extends Fragment {
    private ImageView itemPhotoDetail;
    Photo photo;
    private FloatingActionsMenu fabMenu;
    private FloatingActionButton
            fabDownloadType1, fabDownloadType2, fabDownloadType3;

    public static PhotoDetailFragment getInstance(Photo photo) {
        PhotoDetailFragment photoDetailFragment = new PhotoDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("dataPhoto", photo);
        photoDetailFragment.setArguments(bundle);
        return photoDetailFragment;
    }

    public PhotoDetailFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            photo = (Photo) getArguments().get("dataPhoto");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photo_detail, container, false);
        itemPhotoDetail = view.findViewById(R.id.item_photo_detail);
        fabMenu = view.findViewById(R.id.fab_menu);
        fabDownloadType1 = view.findViewById(R.id.fab_download_type_1);
        fabDownloadType2 = view.findViewById(R.id.fab_download_type_2);
        fabDownloadType3 = view.findViewById(R.id.fab_download_type_3);

        fabDownloadType1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickDownloadType1();
            }
        });

        fabDownloadType2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickDownloadType2();
            }
        });

        fabDownloadType3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickDownloadType3();
            }
        });

        String photoUrl = photo.getUrl_c();
        Picasso.get().load(photoUrl).into(itemPhotoDetail);
        Log.e("Size", "Width: " + photo.getWidth_o() + "/" + "Height: " + photo.getHeight_o());
        return view;
    }

    //375 x 500
    private void onClickDownloadType1() {
        savePhotoType1();
        Toast.makeText(getContext(), "Saved photo", Toast.LENGTH_SHORT).show();
    }

    //768 x 1024
    private void onClickDownloadType2() {
        savePhotoType2();
        Toast.makeText(getContext(), "Saved photo", Toast.LENGTH_SHORT).show();
    }
    //1200 x 1600
    private void onClickDownloadType3() {
        savePhotoType3();
        Toast.makeText(getContext(), "Saved photo", Toast.LENGTH_SHORT).show();
    }

    //Type 1: 375 x 500
    public void savePhotoType1() {
        String fileNameType1 = UUID.randomUUID().toString() + ".jpg";
        Picasso.get()
                .load(photo.getUrl_c())
                .resize(375, 500)
                .into(new SavePhotoHelper(getActivity(), getContext().getContentResolver(),
                        fileNameType1, "Photo description"));

    }

    //Type 2: 768 x 1024
    public void savePhotoType2() {
        String fileNameType2 = UUID.randomUUID().toString() + ".jpg";
        Picasso.get()
                .load(photo.getUrl_c())
                .resize(768, 1024)
                .into(new SavePhotoHelper(getActivity(), getContext().getContentResolver(),
                        fileNameType2, "Photo description"));

    }

    //Type 3: 1200 x 1600
    public void savePhotoType3() {
        String fileNameType3 = UUID.randomUUID().toString() + ".jpg";
        Picasso.get()
                .load(photo.getUrl_c())
                .resize(1200, 1600)
                .into(new SavePhotoHelper(getActivity(), getContext().getContentResolver(),
                        fileNameType3, "Photo description"));

    }
//    public static void photoDownload(Photo photo, String url) {
//        Picasso.get()
//                .load(photo.getUrl_o())
//                .into(getTarget(url));
//    }
//
//    //target to save
//    private static Target getTarget(final String url) {
//        Target target = new Target() {
//
//            @Override
//            public void onBitmapLoaded(final Bitmap bitmap, Picasso.LoadedFrom from) {
//                new Thread(new Runnable() {
//
//                    @Override
//                    public void run() {
//
//                        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/" + url);
//                        try {
//                            file.createNewFile();
//                            FileOutputStream ostream = new FileOutputStream(file);
//                            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, ostream);
//                            ostream.flush();
//                            ostream.close();
//                        } catch (IOException e) {
//                            Log.e("IOException", e.getLocalizedMessage());
//                        }
//                    }
//                }).start();
//
//            }
//
//            @Override
//            public void onBitmapFailed(Exception e, Drawable errorDrawable) {
//
//            }
//
//            @Override
//            public void onPrepareLoad(Drawable placeHolderDrawable) {
//
//            }
//        };
//        return target;
//    }
}