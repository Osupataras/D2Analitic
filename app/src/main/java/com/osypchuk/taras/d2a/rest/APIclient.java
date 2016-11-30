package com.osypchuk.taras.d2a.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Taras on 27.11.2016.
 */

public class ApiClient {

    private static Retrofit retrofit = null;
    private static final String BASE_URL = "https://api.steampowered.com/IDOTA2Match_570/";


    public static Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
