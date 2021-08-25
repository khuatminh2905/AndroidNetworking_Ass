package com.example.anassigment.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Photos implements Serializable {
    @SerializedName("page")
    @Expose
    private int page;

    @SerializedName("pages")
    @Expose
    private int pages;

    @SerializedName("perpage")
    @Expose
    private int perpage;

    @SerializedName("total")
    @Expose
    private int total;

    @SerializedName("photo")
    @Expose
    private List<Photo> photoList;

    public Photos(int page, int pages, int perpage, int total, List<Photo> photoList) {
        this.page = page;
        this.pages = pages;
        this.perpage = perpage;
        this.total = total;
        this.photoList = photoList;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPerpage() {
        return perpage;
    }

    public void setPerpage(int perpage) {
        this.perpage = perpage;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Photo> getPhotoList() {
        return photoList;
    }

    public void setPhotoList(List<Photo> photoList) {
        this.photoList = photoList;
    }
}
