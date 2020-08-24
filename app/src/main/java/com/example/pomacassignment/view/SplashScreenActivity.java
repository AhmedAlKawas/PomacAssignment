package com.example.pomacassignment.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.airbnb.lottie.LottieAnimationView;
import com.example.pomacassignment.R;
import com.example.pomacassignment.model.Article;
import com.example.pomacassignment.view_model.ArticlesViewModel;

import java.io.Serializable;
import java.util.List;

public class SplashScreenActivity extends AppCompatActivity {

    ArticlesViewModel articlesViewModel;
    LottieAnimationView animationView;
    TextView errorTv;
    ImageView refreshIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        initView();
        initListeners();

        articlesViewModel.getArticlesList(SplashScreenActivity.this);

    }

    private void initView() {
        animationView = findViewById(R.id.lottie);
        errorTv = findViewById(R.id.tv_error_occur);
        refreshIv = findViewById(R.id.iv_refresh);
        refreshIv.setOnClickListener(view -> refreshClicked());
    }

    private void refreshClicked() {
        articlesViewModel.getArticlesList(SplashScreenActivity.this);
        animationView.setVisibility(View.VISIBLE);
        errorTv.setVisibility(View.GONE);
        refreshIv.setVisibility(View.GONE);
    }

    private void initListeners() {

        articlesViewModel = new ViewModelProvider(this).get(ArticlesViewModel.class);

        articlesViewModel.returnArticles().observe(this, articles -> {
            if (articles != null)
                goToHomeScreen(articles);
            else
                showErrorOccurred();
        });

    }

    private void showErrorOccurred() {
        animationView.setVisibility(View.GONE);
        errorTv.setVisibility(View.VISIBLE);
        refreshIv.setVisibility(View.VISIBLE);
    }

    private void goToHomeScreen(List<Article> articles) {
        Intent intent = new Intent(SplashScreenActivity.this, HomeActivity.class);
        intent.putExtra(getString(R.string.articles), (Serializable) articles);
        startActivity(intent);
    }
}
