package com.example.pomacassignment.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pomacassignment.R;
import com.example.pomacassignment.model.Article;
import com.example.pomacassignment.view.adapters.ArticlesAdapter;

import java.util.List;

public class HomeActivity extends AppCompatActivity {

    RecyclerView articlesRv;
    ArticlesAdapter articlesAdapter;
    List<Article> articleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {
        articlesRv = findViewById(R.id.rv_articles_list);
        getIntentExtras();
        if (articleList != null) {
            articlesAdapter = new ArticlesAdapter(articleList);
            articlesRv.setAdapter(articlesAdapter);
        }
    }

    @SuppressWarnings("unchecked")
    private void getIntentExtras() {
        if (getIntent().getSerializableExtra(getString(R.string.articles)) != null) {
            articleList = (List<Article>) getIntent().getSerializableExtra(getString(R.string.articles));
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
