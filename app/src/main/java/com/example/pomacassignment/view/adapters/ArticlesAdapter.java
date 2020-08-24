package com.example.pomacassignment.view.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pomacassignment.R;
import com.example.pomacassignment.databinding.ItemArticleBinding;
import com.example.pomacassignment.model.Article;

import java.util.List;

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ArticleHolder> {

    private List<Article> articleList;
    private LayoutInflater layoutInflater;
    private ItemArticleBinding articleBinding;

    public ArticlesAdapter(List<Article> articleList) {
        this.articleList = articleList;
    }

    @NonNull
    @Override
    public ArticleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null)
            layoutInflater = LayoutInflater.from(parent.getContext());
        ItemArticleBinding articleBinding = DataBindingUtil.inflate(layoutInflater,
                R.layout.item_article, parent, false);
        return new ArticleHolder(articleBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ArticleHolder holder, int position) {
        Article articleItem = articleList.get(position);
        holder.articleBinding.setArticle(articleItem);
    }

    @Override
    public int getItemCount() {
        return articleList.size();
    }

    class ArticleHolder extends RecyclerView.ViewHolder {

        ItemArticleBinding articleBinding;

        private ArticleHolder(ItemArticleBinding binding) {
            super(binding.getRoot());
            articleBinding = binding;
        }
    }

}
