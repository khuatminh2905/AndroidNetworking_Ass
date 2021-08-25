package com.example.anassigment.retrofit;

import com.example.anassigment.model.FPhoto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PhotoService {
    //https://www.flickr.com/
    //services/rest/
    //?method=flickr.favorites.getList&
    //api_key=4ae2ddcd39f2d62c0530075fef89023c&
    //user_id=191847702%40N04&
    //extras=views%2C+media%2C+path_alias%2C+url_sq%2C+url_t%2C+
    //url_s%2C+url_q%2C+url_m%2C+url_n%2C+url_z%2C+url_c%2C+url_l%2C+url_o&
    //per_page=50&
    //page=5&
    //format=json&
    //nojsoncallback=1

    @GET("services/rest/?method=flickr.favorites.getList&api_key=f1219e0371c4dc47e3b0494a5331a9a6&user_id=191864913%40N06&extras=views%2C+media%2C+path_alias%2C+url_sq%2C+url_t%2C+url_s%2C+url_q%2C+url_m%2C+url_n%2C+url_z%2C+url_c%2C+url_l%2C+url_o")
    Call<FPhoto> getListPhoto(@Query("per_page") int per_page,
                              @Query("page") int page,
                              @Query("format") String format,
                              @Query("nojsoncallback") String nojsoncallback);

//    @GET("services/rest/?method=flickr.favorites.getList&api_key=4ae2ddcd39f2d62c0530075fef89023c&user_id=191847702%40N04&extras=views%2C+media%2C+path_alias%2C+url_sq%2C+url_t%2C+url_s%2C+url_q%2C+url_m%2C+url_n%2C+url_z%2C+url_c%2C+url_l%2C+url_o&per_page=100&page=1&format=json&nojsoncallback=1")
//    Call<ResponseBody> getPhotos();
}

// https://www.flickr.com/services/rest/?method=flickr.favorites.getList&api_key=f1219e0371c4dc47e3b0494a5331a9a6&user_id=191864913%40N06&extras=views%2C+media%2C+path_alias%2C+url_sq%2C+url_t%2C+url_s%2C+url_q%2C+url_m%2C+url_n%2C+url_z%2C+url_c%2C+url_l%2C+url_o&per_page=100&page=1&format=json&nojsoncallback=1