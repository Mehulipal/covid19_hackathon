package com.example.mevscovid.ui;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceholderApi {
    @GET("posts")
    Call<List<PoliciesClass>> getposts();
}
