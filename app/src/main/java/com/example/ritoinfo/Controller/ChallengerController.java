package com.example.ritoinfo.Controller;

import android.content.SharedPreferences;

import com.example.ritoinfo.Model.Challenger;
import com.example.ritoinfo.View.ChallengerFragment;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ChallengerController {
    private ChallengerFragment fragment;
    private SharedPreferences sharedPreferences;
    private List<Challenger> challengers;
    private final String BASE_URL = "https://euw1.api.riotgames.com/lol/";

    public ChallengerController(ChallengerFragment fragment){
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

        Call<List<Challenger>> call = riotLoLAPI.getChall(1);

        call.enqueue(new Callback<List<Challenger>>() {
            @Override
            public void onResponse(Call<List<Challenger>> call, Response<List<Challenger>> response) {
                if(response.isSuccessful()){
                    challengers = response.body();
                    //fragment.displayToast("Successfull");
                }else {
                    System.out.println(response.errorBody());
                    fragment.displayToast("Error from API call");
                }
                fragment.showChallenger(challengers);
            }

            @Override
            public void onFailure(Call<List<Challenger>> call, Throwable t) {
                fragment.displayToast("Cannot join the API");
            }
        });
    }
}
