package com.example.mevscovid.ui;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface JsonPlaceholderApi5 {
    @GET("mehuli8_5.json")
    Call<List<PoliciesClass>> getposts();


}
