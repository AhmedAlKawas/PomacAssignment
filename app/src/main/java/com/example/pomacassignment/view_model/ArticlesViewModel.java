package com.example.pomacassignment.view_model;

import androidx.lifecycle.ViewModel;

import com.example.pomacassignment.repository.ArticlesRepository;

public class ArticlesViewModel extends ViewModel {

    ArticlesRepository articlesRepository = ArticlesRepository.getInstance();

}
