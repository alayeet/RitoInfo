package com.example.ritoinfo.Model;

public class Match {

    private long gameId;
    private String lane;
    private int champion;
    private String role;
    private long timestamp;

    public void setLane(String lane) {
        this.lane = lane;
    }

    public void setChampion(int champion) {
        this.champion = champion;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getLane() {
        return lane;
    }

    public int getChampion() {
        return champion;
    }

    public String getRole() {
        return role;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public long getgameId() {
        return gameId;
    }

    public void setgameId(long gameId) {
        this.gameId = gameId;
    }



}
