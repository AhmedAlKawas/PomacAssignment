package com.example.pomacassignment.network.services;

import com.example.pomacassignment.network.model.responds.GetArticlesResponse;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ArticlesWebServices {

    @GET()
    Observable<List<GetArticlesResponse>> getArticles();

}
