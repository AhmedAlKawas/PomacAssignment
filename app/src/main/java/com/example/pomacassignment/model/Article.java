package com.example.pomacassignment.model;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.pomacassignment.R;

import java.io.Serializable;

public class Article implements Serializable {

    private String title;
    private String publishedBy;
    private String publishedDate;
    private String imageUrl;

    @BindingAdapter("loadImage")
    public static void loadImageByGlide(ImageView imageView, String imgUrl) {
        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.picture_placeholder)
                .error(R.drawable.picture_placeholder)
                .fitCenter();

        Glide.with(imageView.getContext()).setDefaultRequestOptions(requestOptions)
                .load(imgUrl).into(imageView);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
