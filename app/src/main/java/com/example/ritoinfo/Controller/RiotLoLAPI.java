package com.example.ritoinfo.Controller;

import com.example.ritoinfo.Model.Match;
import com.example.ritoinfo.Model.Summoner;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RiotLoLAPI {

    @Headers("X-Riot-Token: RGAPI-d925f8be-88dc-4400-ae31-7f26fae2606c")
    @GET("match/v4/matchlists/by-account/qerNL4kol8KDKX59MQ_6wsctg8BQBRLSM_yc1iemq3NHIto?endIndex=5/")
    Call<List<Match>> getMatchHistory();

    @Headers("X-Riot-Token: RGAPI-d925f8be-88dc-4400-ae31-7f26fae2606c")
    @GET("summoner/v4/summoners/by-name/Jsuis si marrant") Call<Summoner> getSummoner();

    //@GET("/platform/v3/champion-rotations")

}
