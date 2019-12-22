package com.example.ritoinfo.Controller;

import android.content.SharedPreferences;

import com.example.ritoinfo.Model.Summoner;
import com.example.ritoinfo.View.ListMatchFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Controller {

    private ListMatchFragment fragment;
    private SharedPreferences sharedPreferences;
    private Summoner summoner;

    public void start(){

        RiotLoLAPI riotLoLAPI = RetrofitInstance.getRetrofitInstance().create(RiotLoLAPI.class);



        Call<Summoner> call = riotLoLAPI.getSummonerByName("test");

        call.enqueue(new Callback<Summoner>() {
            @Override
            public void onResponse(Call<Summoner> call, Response<Summoner> response) {
                if(response.isSuccessful()){
                    summoner = response.body();
                }else {
                    System.out.println(response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<Summoner> call, Throwable t) {

            }
        });

    }

}
