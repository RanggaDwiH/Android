package com.komputerkit.catalogmovie.res;

import com.komputerkit.catalogmovie.model.Response;
import com.komputerkit.catalogmovie.model.Result;



import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("/3/movie/{category}")
    Call<Response> getMovie(
            @Path("category") String category,
            @Query("api_key") String api_key,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("/3/search/movie")
            Call<Response> getQuery(
            @Query("api_key") String apikey,
            @Query("language") String language,
            @Query("query") String query,
            @Query("page") int page
    );



}
