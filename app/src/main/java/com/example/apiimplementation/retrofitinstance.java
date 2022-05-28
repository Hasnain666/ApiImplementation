package com.example.apiimplementation;

import java.lang.reflect.GenericSignatureFormatError;

import okio.GzipSource;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class retrofitinstance {
    private static Retrofit retrofit;
    private static final String BASEURL = "https://jsonplaceholder.typicode.com/";

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl(BASEURL).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
