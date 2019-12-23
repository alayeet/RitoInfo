package com.example.ritoinfo.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RiotLoLAPI {
    String riotAPIToken = "RGAPI-49dc4e5b-3657-4310-99f6-6f215456c04e";

    @Headers("X-Riot-Token: "+riotAPIToken)
    @GET("match/v4/matchlists/by-account/{accountId}")
    Call<List<Match>> getMatchHistory(@Path("accoutId") String accountId, @Query("endIndex") int endIndex);

    @Headers("X-Riot-Token: "+riotAPIToken)
    @GET("summoner/v4/summoners/by-name/{summonerName}")
    Call<Summoner> getSummoner(@Path("summonerName") String summonerName);

    @Headers("X-Riot-Token: "+riotAPIToken)
    @GET("league-exp/v4/entries/RANKED_SOLO_5x5/CHALLENGER/I")
    Call<List<Challenger>> getChall(@Query("page") int page);

    //@GET("/platform/v3/champion-rotations")

}
