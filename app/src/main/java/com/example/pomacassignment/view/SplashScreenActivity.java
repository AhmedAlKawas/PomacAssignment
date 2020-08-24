package com.example.pomacassignment.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.pomacassignment.R;
import com.example.pomacassignment.model.Article;
import com.example.pomacassignment.view_model.ArticlesViewModel;

import java.io.Serializable;
import java.util.List;

public class SplashScreenActivity extends AppCompatActivity {

    ArticlesViewModel articlesViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        initListeners();

        articlesViewModel.getArticlesList();

    }

    private void initListeners() {

        articlesViewModel = new ViewModelProvider(this).get(ArticlesViewModel.class);

        articlesViewModel.returnArticles().observe(this, articles -> {
            if (articles != null)
                goToHomeScreen(articles);
        });

    }

    private void goToHomeScreen(List<Article> articles) {
        Intent intent = new Intent(SplashScreenActivity.this, HomeActivity.class);
        intent.putExtra(getString(R.string.articles), (Serializable) articles);
        startActivity(intent);
    }
}
