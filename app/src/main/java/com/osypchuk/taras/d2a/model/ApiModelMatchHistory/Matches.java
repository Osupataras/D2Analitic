package com.osypchuk.taras.d2a.model.ApiModelMatchHistory;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Taras on 27.11.2016.
 */

public class Matches {

    @SerializedName("match_id")
    private String matchId;
    @SerializedName("match_seq_num")
    private String matchSeqNum;
    @SerializedName("start_time")
    private String startTime;
    @SerializedName("lobby_type")
    private String lobbyType;
    @SerializedName("radiant_team_id")
    private String radiantTeamId;
    @SerializedName("players")
    private List<Players> players;

    public Matches(String lobbyType, String matchId, String matchSeqNum, List<Players> players, String radiantTeamId, String startTime) {
        this.lobbyType = lobbyType;
        this.matchId = matchId;
        this.matchSeqNum = matchSeqNum;
        this.players = players;
        this.radiantTeamId = radiantTeamId;
        this.startTime = startTime;

    }

    public String getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(String lobbyType) {
        this.lobbyType = lobbyType;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getMatchSeqNum() {
        return matchSeqNum;
    }

    public void setMatchSeqNum(String matchSeqNum) {
        this.matchSeqNum = matchSeqNum;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public String getRadiantTeamId() {
        return radiantTeamId;
    }

    public void setRadiantTeamId(String radiantTeamId) {
        this.radiantTeamId = radiantTeamId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Matches{" +
                "lobbyType='" + lobbyType + '\'' +
                ", matchId='" + matchId + '\'' +
                ", matchSeqNum='" + matchSeqNum + '\'' +
                ", startTime='" + startTime + '\'' +
                ", radiantTeamId='" + radiantTeamId + '\'' +
                ", players=" + players +
                '}';
    }
}
