package com.example.ritoinfo.Model;

public class Match {

    private long gameID;
    private String gameMode;
    private long gameDurationInSec;
    private long  gameCreation;

    public long getGameID() {
        return gameID;
    }

    public void setGameID(long gameID) {
        this.gameID = gameID;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public long getGameDurationInSec() {
        return gameDurationInSec;
    }

    public void setGameDurationInSec(long gameDurationInSec) {
        this.gameDurationInSec = gameDurationInSec;
    }

    public long getGameCreation() {
        return gameCreation;
    }

    public void setGameCreation(long gameCreation) {
        this.gameCreation = gameCreation;
    }

}
