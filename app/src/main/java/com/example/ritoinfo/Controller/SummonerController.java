package com.example.ritoinfo.Controller;

import android.content.SharedPreferences;

import com.example.ritoinfo.Model.Match;
import com.example.ritoinfo.Model.Summoner;
import com.example.ritoinfo.View.ListMatchFragment;
import com.example.ritoinfo.View.SummonerFragment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SummonerController {
    private SummonerFragment fragment;
    private SharedPreferences sharedPreferences;
    private Summoner summoner;
    private final String BASE_URL = "https://euw1.api.riotgames.com/lol/";

    public SummonerController(SummonerFragment fragment){
        this.fragment = fragment;
    }

    public void start(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        RiotLoLAPI riotLoLAPI = retrofit.create(RiotLoLAPI.class);

        Call<Summoner> call = riotLoLAPI.getSummoner();

        call.enqueue(new Callback<Summoner>() {
            @Override
            public void onResponse(Call<Summoner> call, Response<Summoner> response) {
                if(response.isSuccessful()){
                    summoner = response.body();
                    fragment.displayToast("Successfull");
                }else {
                    System.out.println(response.errorBody());
                    fragment.displayToast("Error");
                }
                fragment.showSummoner(summoner);
            }

            @Override
            public void onFailure(Call<Summoner> call, Throwable t) {
                fragment.displayToast(t.getMessage());
            }
        });
    }
}
