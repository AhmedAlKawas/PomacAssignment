package com.example.pomacassignment.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.pomacassignment.R;
import com.example.pomacassignment.databinding.ActivityArticleDetailsBinding;
import com.example.pomacassignment.model.Article;

public class ArticleDetailsActivity extends AppCompatActivity {

    private ActivityArticleDetailsBinding articleDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        articleDetailsBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_article_details);
        getIntentExtras();
        articleDetailsBinding.ivBack.setOnClickListener(view -> {
            super.onBackPressed();
        });
    }

    private void getIntentExtras() {
        if (getIntent().getSerializableExtra(getString(R.string.articles)) != null){
            articleDetailsBinding.setArticle((Article) getIntent()
                    .getSerializableExtra(getString(R.string.articles)));
        }
    }
}
