package com.example.ritoinfo.Controller;

import com.example.ritoinfo.Model.Summoner;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class Controller {

    public void start(){
        //RetrofitInstance retrofit = new RetrofitInstance();

        RiotLoLAPI riotLoLAPI = RetrofitInstance.getRetrofitInstance().create(RiotLoLAPI.class);

        Call<Summoner> call = riotLoLAPI.getSummonerByName("Jsuis si marrant");

        call.enqueue(new Callback<Summoner>() {
            @Override
            public void onResponse(Call<Summoner> call, Response<Summoner> response) {
                if(response.isSuccessful()){
                    System.out.println(response.body());
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
