package com.example.ritoinfo.Model;

public class Summoner {

    private int profileIconId;
    private String summonerName;
    private String summonerPUUID;
    private String accountId;
    private String summonerId;
    private int revisionDate;

    public int getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(int profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getSummonerName() {
        return summonerName;
    }

    public void setSummonerName(String summonerName) {
        this.summonerName = summonerName;
    }

    public String getSummonerPUUID() {
        return summonerPUUID;
    }

    public void setSummonerPUUID(String summonerPUUID) {
        this.summonerPUUID = summonerPUUID;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public int getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(int revisionDate) {
        this.revisionDate = revisionDate;
    }
}
