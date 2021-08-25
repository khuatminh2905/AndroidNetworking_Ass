package com.example.anassigment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Photo implements Serializable {
//            "id": "9863317834",
//            "owner": "47538938@N08",
//            "secret": "292db962a4",
//            "server": "2826",
//            "farm": 3,
//            "title": "Taylor Swift - Taylor Swift Concert - Bridgestone Arena - Nashville, Tn 9-20-13 IMG_2811",
//            "ispublic": 1,
//            "isfriend": 0,
//            "isfamily": 0,
//            "views": "5572",
//            "date_faved": "1627390989",
//            "media": "photo",
//            "media_status": "ready",
//            "url_sq": "https://live.staticflickr.com/2826/9863317834_292db962a4_s.jpg",
//            "height_sq": 75,
//            "width_sq": 75,
//            "url_t": "https://live.staticflickr.com/2826/9863317834_292db962a4_t.jpg",
//            "height_t": 100,
//            "width_t": 75,
//            "url_s": "https://live.staticflickr.com/2826/9863317834_292db962a4_m.jpg",
//            "height_s": 240,
//            "width_s": 180,
//            "url_q": "https://live.staticflickr.com/2826/9863317834_292db962a4_q.jpg",
//            "height_q": 150,
//            "width_q": 150,
//            "url_m": "https://live.staticflickr.com/2826/9863317834_292db962a4.jpg",
//            "height_m": 500,
//            "width_m": 375,
//            "url_n": "https://live.staticflickr.com/2826/9863317834_292db962a4_n.jpg",
//            "height_n": 320,
//            "width_n": 240,
//            "url_z": "https://live.staticflickr.com/2826/9863317834_292db962a4_z.jpg",
//            "height_z": 640,
//            "width_z": 480,
//            "url_c": "https://live.staticflickr.com/2826/9863317834_292db962a4_c.jpg",
//            "height_c": 800,
//            "width_c": 600,
//            "url_l": "https://live.staticflickr.com/2826/9863317834_292db962a4_b.jpg",
//            "height_l": 1024,
//            "width_l": 768,
//            "url_o": "https://live.staticflickr.com/2826/9863317834_498f265ea1_o.jpg",
//            "height_o": 4320,
//            "width_o": 3240,
//            "pathalias": "tncountryfan"


    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("owner")
    @Expose
    private String owner;

    @SerializedName("secret")
    @Expose
    private String secret;

    @SerializedName("server")
    @Expose
    private String server;

    @SerializedName("farm")
    @Expose
    private int farm;

    @SerializedName("title")
    @Expose
    private String title;


    @SerializedName("ispublic")
    @Expose
    private int ispublic;

    @SerializedName("isfriend")
    @Expose
    private int isfriend;

    @SerializedName("isfamily")
    @Expose
    private int isfamily;


    @SerializedName("views")
    @Expose
    private String views;

    @SerializedName("date_faved")
    @Expose
    private String date_faved;

    @SerializedName("media")
    @Expose
    private String media;

    @SerializedName("media_status")
    @Expose
    private String media_status;


    @SerializedName("url_sq")
    @Expose
    private String url_sq;

    @SerializedName("height_sq")
    @Expose
    private int height_sq;

    @SerializedName("width_sq")
    @Expose
    private int width_sq;


    //Photo size t
    @SerializedName("url_t")
    @Expose
    private String url_t;

    @SerializedName("height_t")
    @Expose
    private int height_t;

    @SerializedName("width_t")
    @Expose
    private int width_t;


    //Photo size s
    @SerializedName("url_s")
    @Expose
    private String url_s;

    @SerializedName("height_s")
    @Expose
    private int height_s;

    @SerializedName("width_s")
    @Expose
    private int width_s;


    //Photo size q
    @SerializedName("url_q")
    @Expose
    private String url_q;

    @SerializedName("height_q")
    @Expose
    private int height_q;

    @SerializedName("width_q")
    @Expose
    private int width_q;


    //Photo size m
    @SerializedName("url_m")
    @Expose
    private String url_m;

    @SerializedName("height_m")
    @Expose
    private int height_m;

    @SerializedName("width_m")
    @Expose
    private int width_m;


    //Photo size n
    @SerializedName("url_n")
    @Expose
    private String url_n;

    @SerializedName("height_n")
    @Expose
    private int height_n;

    @SerializedName("width_n")
    @Expose
    private int width_n;


    //Photo size z
    @SerializedName("url_z")
    @Expose
    private String url_z;

    @SerializedName("height_z")
    @Expose
    private int height_z;

    @SerializedName("width_z")
    @Expose
    private int width_z;


    //Photo size c
    @SerializedName("url_c")
    @Expose
    private String url_c;

    @SerializedName("height_c")
    @Expose
    private int height_c;

    @SerializedName("width_c")
    @Expose
    private int width_c;


    //Photo size l
    @SerializedName("url_l")
    @Expose
    private String url_l;

    @SerializedName("height_l")
    @Expose
    private int height_l;

    @SerializedName("width_l")
    @Expose
    private int width_l;


    //Photo size o
    @SerializedName("url_o")
    @Expose
    private String url_o;

    @SerializedName("height_o")
    @Expose
    private int height_o;

    @SerializedName("width_o")
    @Expose
    private int width_o;


    @SerializedName("pathalias")
    @Expose
    private String pathalias;

    //Constructor
    public Photo(String id, String owner, String secret, String server, int farm, String title, int ispublic, int isfriend, int isfamily, String views, String date_faved, String media, String media_status, String url_sq, int height_sq, int width_sq, String url_t, int height_t, int width_t, String url_s, int height_s, int width_s, String url_q, int height_q, int width_q, String url_m, int height_m, int width_m, String url_n, int height_n, int width_n, String url_z, int height_z, int width_z, String url_c, int height_c, int width_c, String url_l, int height_l, int width_l, String url_o, int height_o, int width_o, String pathalias) {
        this.id = id;
        this.owner = owner;
        this.secret = secret;
        this.server = server;
        this.farm = farm;
        this.title = title;
        this.ispublic = ispublic;
        this.isfriend = isfriend;
        this.isfamily = isfamily;
        this.views = views;
        this.date_faved = date_faved;
        this.media = media;
        this.media_status = media_status;
        this.url_sq = url_sq;
        this.height_sq = height_sq;
        this.width_sq = width_sq;
        this.url_t = url_t;
        this.height_t = height_t;
        this.width_t = width_t;
        this.url_s = url_s;
        this.height_s = height_s;
        this.width_s = width_s;
        this.url_q = url_q;
        this.height_q = height_q;
        this.width_q = width_q;
        this.url_m = url_m;
        this.height_m = height_m;
        this.width_m = width_m;
        this.url_n = url_n;
        this.height_n = height_n;
        this.width_n = width_n;
        this.url_z = url_z;
        this.height_z = height_z;
        this.width_z = width_z;
        this.url_c = url_c;
        this.height_c = height_c;
        this.width_c = width_c;
        this.url_l = url_l;
        this.height_l = height_l;
        this.width_l = width_l;
        this.url_o = url_o;
        this.height_o = height_o;
        this.width_o = width_o;
        this.pathalias = pathalias;
    }


    //Getter and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getFarm() {
        return farm;
    }

    public void setFarm(int farm) {
        this.farm = farm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIspublic() {
        return ispublic;
    }

    public void setIspublic(int ispublic) {
        this.ispublic = ispublic;
    }

    public int getIsfriend() {
        return isfriend;
    }

    public void setIsfriend(int isfriend) {
        this.isfriend = isfriend;
    }

    public int getIsfamily() {
        return isfamily;
    }

    public void setIsfamily(int isfamily) {
        this.isfamily = isfamily;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getDate_faved() {
        return date_faved;
    }

    public void setDate_faved(String date_faved) {
        this.date_faved = date_faved;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMedia_status() {
        return media_status;
    }

    public void setMedia_status(String media_status) {
        this.media_status = media_status;
    }

    public String getUrl_sq() {
        return url_sq;
    }

    public void setUrl_sq(String url_sq) {
        this.url_sq = url_sq;
    }

    public int getHeight_sq() {
        return height_sq;
    }

    public void setHeight_sq(int height_sq) {
        this.height_sq = height_sq;
    }

    public int getWidth_sq() {
        return width_sq;
    }

    public void setWidth_sq(int width_sq) {
        this.width_sq = width_sq;
    }

    public String getUrl_t() {
        return url_t;
    }

    public void setUrl_t(String url_t) {
        this.url_t = url_t;
    }

    public int getHeight_t() {
        return height_t;
    }

    public void setHeight_t(int height_t) {
        this.height_t = height_t;
    }

    public int getWidth_t() {
        return width_t;
    }

    public void setWidth_t(int width_t) {
        this.width_t = width_t;
    }

    public String getUrl_s() {
        return url_s;
    }

    public void setUrl_s(String url_s) {
        this.url_s = url_s;
    }

    public int getHeight_s() {
        return height_s;
    }

    public void setHeight_s(int height_s) {
        this.height_s = height_s;
    }

    public int getWidth_s() {
        return width_s;
    }

    public void setWidth_s(int width_s) {
        this.width_s = width_s;
    }

    public String getUrl_q() {
        return url_q;
    }

    public void setUrl_q(String url_q) {
        this.url_q = url_q;
    }

    public int getHeight_q() {
        return height_q;
    }

    public void setHeight_q(int height_q) {
        this.height_q = height_q;
    }

    public int getWidth_q() {
        return width_q;
    }

    public void setWidth_q(int width_q) {
        this.width_q = width_q;
    }

    public String getUrl_m() {
        return url_m;
    }

    public void setUrl_m(String url_m) {
        this.url_m = url_m;
    }

    public int getHeight_m() {
        return height_m;
    }

    public void setHeight_m(int height_m) {
        this.height_m = height_m;
    }

    public int getWidth_m() {
        return width_m;
    }

    public void setWidth_m(int width_m) {
        this.width_m = width_m;
    }

    public String getUrl_n() {
        return url_n;
    }

    public void setUrl_n(String url_n) {
        this.url_n = url_n;
    }

    public int getHeight_n() {
        return height_n;
    }

    public void setHeight_n(int height_n) {
        this.height_n = height_n;
    }

    public int getWidth_n() {
        return width_n;
    }

    public void setWidth_n(int width_n) {
        this.width_n = width_n;
    }

    public String getUrl_z() {
        return url_z;
    }

    public void setUrl_z(String url_z) {
        this.url_z = url_z;
    }

    public int getHeight_z() {
        return height_z;
    }

    public void setHeight_z(int height_z) {
        this.height_z = height_z;
    }

    public int getWidth_z() {
        return width_z;
    }

    public void setWidth_z(int width_z) {
        this.width_z = width_z;
    }

    public String getUrl_c() {
        return url_c;
    }

    public void setUrl_c(String url_c) {
        this.url_c = url_c;
    }

    public int getHeight_c() {
        return height_c;
    }

    public void setHeight_c(int height_c) {
        this.height_c = height_c;
    }

    public int getWidth_c() {
        return width_c;
    }

    public void setWidth_c(int width_c) {
        this.width_c = width_c;
    }

    public String getUrl_l() {
        return url_l;
    }

    public void setUrl_l(String url_l) {
        this.url_l = url_l;
    }

    public int getHeight_l() {
        return height_l;
    }

    public void setHeight_l(int height_l) {
        this.height_l = height_l;
    }

    public int getWidth_l() {
        return width_l;
    }

    public void setWidth_l(int width_l) {
        this.width_l = width_l;
    }

    public String getUrl_o() {
        return url_o;
    }

    public void setUrl_o(String url_o) {
        this.url_o = url_o;
    }

    public int getHeight_o() {
        return height_o;
    }

    public void setHeight_o(int height_o) {
        this.height_o = height_o;
    }

    public int getWidth_o() {
        return width_o;
    }

    public void setWidth_o(int width_o) {
        this.width_o = width_o;
    }

    public String getPathalias() {
        return pathalias;
    }

    public void setPathalias(String pathalias) {
        this.pathalias = pathalias;
    }
}
