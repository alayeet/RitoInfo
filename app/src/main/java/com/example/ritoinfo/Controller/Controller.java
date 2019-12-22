package com.example.ritoinfo.Controller;

import android.content.SharedPreferences;

import com.example.ritoinfo.Model.Match;
import com.example.ritoinfo.Model.Summoner;
import com.example.ritoinfo.View.ListMatchFragment;
import com.google.gson.Gson;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Controller {

    private ListMatchFragment fragment;
    private SharedPreferences sharedPreferences;
    private List<Match> matchs;

    public Controller(ListMatchFragment fragment){
        this.fragment = fragment;
    }

    public void start(){

        RiotLoLAPI riotLoLAPI = RetrofitInstance.getRetrofitInstance().create(RiotLoLAPI.class);



        Call<List<Match>> call = riotLoLAPI.getMatchHistory();

        call.enqueue(new Callback<List<Match>>() {
            @Override
            public void onResponse(Call<List<Match>> call, Response<List<Match>> response) {
                if(response.isSuccessful()){
                    matchs = response.body();
                    fragment.displayToast("Connexion réussie");
                }else {
                    System.out.println(response.errorBody());
                }
                fragment.showList(matchs);
            }

            @Override
            public void onFailure(Call<List<Match>> call, Throwable t) {
                fragment.displayToast("Erreur de connexion à l'API");
            }
        });
    }

    public void onItemClick(Match item){
        Gson gson = new Gson();
        String json = gson.toJson(item);
        fragment.navToMatch(json);
    }

}
