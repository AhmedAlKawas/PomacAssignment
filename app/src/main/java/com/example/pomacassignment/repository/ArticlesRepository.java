package com.example.pomacassignment.repository;

import com.example.pomacassignment.network.model.responds.GetArticlesResponse;
import com.example.pomacassignment.network.services.ArticlesWebServices;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ArticlesRepository {

    private ArticlesWebServices articlesWebServices;

    private ArticlesRepository() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
        String BASE_URL = "https://api.nytimes.com/svc/news/v3/content/";
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .client(client).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        articlesWebServices = retrofit.create(ArticlesWebServices.class);

    }

    public static ArticlesRepository getInstance() {
        return Loader.articlesRepository;
    }

    private static class Loader {
        static ArticlesRepository articlesRepository = new ArticlesRepository();
    }

    public Observable<GetArticlesResponse> getArticlesRepository() {

        return Observable.create(emitter -> {

            articlesWebServices.getArticles().observeOn(Schedulers.io()).subscribeOn(Schedulers.io())
                    .subscribe(new Observer<GetArticlesResponse>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(GetArticlesResponse getArticlesResponse) {
                            emitter.onNext(getArticlesResponse);
                        }

                        @Override
                        public void onError(Throwable e) {
                            emitter.onError(e);
                        }

                        @Override
                        public void onComplete() {

                        }
                    });

        });

    }

}
