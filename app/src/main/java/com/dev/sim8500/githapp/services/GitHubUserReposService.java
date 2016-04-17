package com.dev.sim8500.githapp.services;

import com.dev.sim8500.githapp.models.RepoModel;
import com.dev.sim8500.githapp.models.RepoSearchModel;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by sbernad on 18.12.15.
 */
public interface GitHubUserReposService {

    @GET("/user/repos")
    Call<List<RepoModel>> getUserRepos();

    @GET("/search/repositories")
    Observable<RepoSearchModel> getSearchReposResult(@Query("q") String query);
}
