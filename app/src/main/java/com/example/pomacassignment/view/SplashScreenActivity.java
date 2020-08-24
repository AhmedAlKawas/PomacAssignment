package com.example.pomacassignment.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.pomacassignment.R;
import com.example.pomacassignment.view_model.ArticlesViewModel;

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
            Log.e("testt", articles.get(0).getTitle());
        });

    }
}
