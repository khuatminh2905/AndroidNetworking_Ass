package com.example.anassigment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.anassigment.adapter.OnItemClickListener;
import com.example.anassigment.adapter.PhotoAdapter;
import com.example.anassigment.model.FPhoto;
import com.example.anassigment.model.Photo;
import com.example.anassigment.model.Photos;
import com.example.anassigment.retrofit.PhotoService;
import com.example.anassigment.retrofit.RetrofitInstance;
import com.example.anassigment.scrollView.EndlessRecyclerViewScrollListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity implements OnItemClickListener {
    //Tham so
    private static int PER_PAGE = 10;
    private static int PAGE = 0;
    private static final String FORMAT = "json";
    private static final String NONJSONCALLBACK = "1";

    //Anh xa
    private RecyclerView rcvPhoto;

    PhotoAdapter photoAdapter;
    private List<Photo> photoList;

//    GridLayoutManager gridLayoutManager;

    StaggeredGridLayoutManager staggeredGridLayoutManager;

    RelativeLayout progressLoadMore;

    private EndlessRecyclerViewScrollListener scrollListener;

    Parcelable state;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cap quyen cho may
        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
        ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);

        initUi();

        loadData(PAGE);

    }

    //Load anh
    private void loadData(int PAGE) {
        Retrofit retrofit = RetrofitInstance.getInstance();
        PhotoService photoService = retrofit.create(PhotoService.class);
        photoService.getListPhoto(PER_PAGE, PAGE, FORMAT, NONJSONCALLBACK)
                .enqueue(new Callback<FPhoto>() {
                    @Override
                    public void onResponse(Call<FPhoto> call, Response<FPhoto> response) {
                        Photos photos = response.body().getPhotos();

                        if (progressLoadMore.getVisibility() == View.VISIBLE) {
                            progressLoadMore.setVisibility(View.GONE);
                        }
                        if (photos == null) return;

                        //Gan list
                        photoList.addAll(photos.getPhotoList());
                        Log.d("SizeOfPhotos", photoList.size() + "");
                        photoAdapter.setData(photoList, photos, MainActivity.this::onItemClick);
                    }

                    @Override
                    public void onFailure(Call<FPhoto> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Không kết nối internet", Toast.LENGTH_LONG).show();
                    }
                });

//        photoService.getPhotos().enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    Log.d("Total", response.body().string());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                Toast.makeText(MainActivity.this, "Call API successfully", Toast.LENGTH_LONG).show();
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Call API failed", Toast.LENGTH_LONG).show();
//            }
//        });
    }

    private void initUi() {
        rcvPhoto = findViewById(R.id.rcv_photo);

        progressLoadMore = findViewById(R.id.load_more);

        //Xet gridlayout
//        gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        //Khoi tao array list
        photoList = new ArrayList<>();

        //Set layout
        rcvPhoto.setLayoutManager(staggeredGridLayoutManager);

        //Set adapter
        photoAdapter = new PhotoAdapter(MainActivity.this);
        rcvPhoto.setAdapter(photoAdapter);

        scrollListener = new EndlessRecyclerViewScrollListener(staggeredGridLayoutManager) {
            @Override
            public void onLoadMore(int page, int totalItemsCount, RecyclerView view) {
                progressLoadMore.setVisibility(View.VISIBLE);
                // progressDialog.show();
                loadData(page + 1);
            }
        };

        rcvPhoto.addOnScrollListener(scrollListener);
    }

    @Override
    public void onItemClick(Photos photos) {
        Intent intent = new Intent(MainActivity.this, ViewPagerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("photoList", photos);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
//        Intent setIntent = new Intent(Intent.ACTION_MAIN);
//        setIntent.addCategory(Intent.CATEGORY_HOME);
//        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        startActivity(setIntent);

        moveTaskToBack(true);
    }
}