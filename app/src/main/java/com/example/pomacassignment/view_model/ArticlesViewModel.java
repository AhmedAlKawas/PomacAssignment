package com.example.pomacassignment.view_model;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.pomacassignment.model.Article;
import com.example.pomacassignment.network.model.responds.GetArticlesResponse;
import com.example.pomacassignment.repository.ArticlesRepository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class ArticlesViewModel extends ViewModel {

    private ArticlesRepository articlesRepository = ArticlesRepository.getInstance();

    private List<Article> articleList;

    private MutableLiveData<List<Article>> getArticlesResponse = new MutableLiveData<>();

    public MutableLiveData<List<Article>> returnArticles() {
        return getArticlesResponse;
    }

    public void getArticlesList() {

        articlesRepository.getArticlesRepository().subscribe(new Observer<GetArticlesResponse>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(GetArticlesResponse response) {

                if (response.getStatus().equals("OK")) {

                    articleList = new ArrayList<>();
                    Article article;

                    for (GetArticlesResponse.Result result : response.getResults()) {

                        article = new Article();
                        article.setTitle(result.getTitle());
                        article.setPublishedBy(result.getByline());
                        article.setPublishedDate(result.getPublishedDate());
                        article.setImageUrl(result.getThumbnailStandard());
                        article.setAbstractStr(result.getAbstract());
                        articleList.add(article);

                    }

                    getArticlesResponse.postValue(articleList);

                } else
                    getArticlesResponse.postValue(null);

            }

            @Override
            public void onError(Throwable e) {
                getArticlesResponse.postValue(null);
            }

            @Override
            public void onComplete() {

            }
        });

    }

}
