package com.example.ritoinfo.Controller;

import com.example.ritoinfo.Model.Challenger;
import com.example.ritoinfo.Model.Match;
import com.example.ritoinfo.Model.Summoner;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RiotLoLAPI {

    @Headers("X-Riot-Token: RGAPI-49dc4e5b-3657-4310-99f6-6f215456c04e")
    @GET("match/v4/matchlists/by-account/NiLLiJ2MpBoHxstUT98Q1TM7zTu7f7vwHZ5Z0t2p0OPTiS72jSt8G8b-")
    Call<List<Match>> getMatchHistory();

    @Headers("X-Riot-Token: RGAPI-49dc4e5b-3657-4310-99f6-6f215456c04e")
    @GET("summoner/v4/summoners/by-name/Jsuis si marrant") Call<Summoner> getSummoner();

    @Headers("X-Riot-Token: RGAPI-49dc4e5b-3657-4310-99f6-6f215456c04e")
    @GET("league-exp/v4/entries/RANKED_SOLO_5x5/CHALLENGER/I") Call<List<Challenger>> getChall(@Query("page") int page);

    //@GET("/platform/v3/champion-rotations")

}
