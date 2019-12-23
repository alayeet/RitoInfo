package com.example.ritoinfo.Model;

public class Summoner {

    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private String accountId;
    private String id;
    private long revisionDate;


    public long getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(long summonerLevel) {
        this.summonerLevel = summonerLevel;
    }
    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getSummonerName() {
        return name;
    }

    public void setSummonerName(String summonerName) {
        this.name = summonerName;
    }

    public String getSummonerPUUID() {
        return puuid;
    }

    public void setSummonerPUUID(String summonerPUUID) {
        this.puuid = summonerPUUID;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSummonerId() {
        return id;
    }

    public void setSummonerId(String summonerId) {
        this.id = summonerId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(int revisionDate) {
        this.revisionDate = revisionDate;
    }
}
