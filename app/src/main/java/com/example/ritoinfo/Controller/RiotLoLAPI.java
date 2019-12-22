package com.example.ritoinfo.Controller;

import com.example.ritoinfo.Model.Summoner;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RiotLoLAPI {

    @Headers({
            "X-Riot-Token: RGAPI-286a1ce0-704b-4c80-ade6-bb025aad10ca"
    })

    @GET("/summoner/v4/summoners/by-name/")
    Call<Summoner> getSummonerByName(@Path("summonerName") String summonerName);

    //@GET("/platform/v3/champion-rotations")

}
