package com.osypchuk.taras.d2a.model.ApiModelMatchDetails;

import java.util.List;

/**
 * Created by Taras on 30.11.2016.
 */

public class Result {
    public List<Players> players;
    public Boolean radiant_win;
    public String duration;
    public String pre_game_duration;
    public String start_time;
    public String match_id;
    public String match_seq_num;
    public String tower_status_radiant;
    public String tower_status_dire;
    public String barracks_status_radiant;
    public String barracks_status_dire;
    public String cluster;
    public String first_blood_time;
    public String lobby_type;
    public String human_players;
    public String leagueid;
    public String positive_votes;
    public String negative_votes;
    public String game_mode;
    public String flags;
    public String engine;
    public String radiant_score;
    public String dire_score;

    public Result(String barracks_status_dire, String barracks_status_radiant, String cluster, String dire_score, String duration, String engine, String first_blood_time, String flags, String game_mode, String human_players, String leagueid, String lobby_type, String match_id, String match_seq_num, String negative_votes, List<Players> players, String positive_votes, String pre_game_duration, String radiant_score, Boolean radiant_win, String start_time, String tower_status_dire, String tower_status_radiant) {
        this.barracks_status_dire = barracks_status_dire;
        this.barracks_status_radiant = barracks_status_radiant;
        this.cluster = cluster;
        this.dire_score = dire_score;
        this.duration = duration;
        this.engine = engine;
        this.first_blood_time = first_blood_time;
        this.flags = flags;
        this.game_mode = game_mode;
        this.human_players = human_players;
        this.leagueid = leagueid;
        this.lobby_type = lobby_type;
        this.match_id = match_id;
        this.match_seq_num = match_seq_num;
        this.negative_votes = negative_votes;
        this.players = players;
        this.positive_votes = positive_votes;
        this.pre_game_duration = pre_game_duration;
        this.radiant_score = radiant_score;
        this.radiant_win = radiant_win;
        this.start_time = start_time;
        this.tower_status_dire = tower_status_dire;
        this.tower_status_radiant = tower_status_radiant;
    }

    public String getBarracks_status_dire() {
        return barracks_status_dire;
    }

    public void setBarracks_status_dire(String barracks_status_dire) {
        this.barracks_status_dire = barracks_status_dire;
    }

    public String getBarracks_status_radiant() {
        return barracks_status_radiant;
    }

    public void setBarracks_status_radiant(String barracks_status_radiant) {
        this.barracks_status_radiant = barracks_status_radiant;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public String getDire_score() {
        return dire_score;
    }

    public void setDire_score(String dire_score) {
        this.dire_score = dire_score;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFirst_blood_time() {
        return first_blood_time;
    }

    public void setFirst_blood_time(String first_blood_time) {
        this.first_blood_time = first_blood_time;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getGame_mode() {
        return game_mode;
    }

    public void setGame_mode(String game_mode) {
        this.game_mode = game_mode;
    }

    public String getHuman_players() {
        return human_players;
    }

    public void setHuman_players(String human_players) {
        this.human_players = human_players;
    }

    public String getLeagueid() {
        return leagueid;
    }

    public void setLeagueid(String leagueid) {
        this.leagueid = leagueid;
    }

    public String getLobby_type() {
        return lobby_type;
    }

    public void setLobby_type(String lobby_type) {
        this.lobby_type = lobby_type;
    }

    public String getMatch_id() {
        return match_id;
    }

    public void setMatch_id(String match_id) {
        this.match_id = match_id;
    }

    public String getMatch_seq_num() {
        return match_seq_num;
    }

    public void setMatch_seq_num(String match_seq_num) {
        this.match_seq_num = match_seq_num;
    }

    public String getNegative_votes() {
        return negative_votes;
    }

    public void setNegative_votes(String negative_votes) {
        this.negative_votes = negative_votes;
    }

    public List<Players> getPlayers() {
        return players;
    }

    public void setPlayers(List<Players> players) {
        this.players = players;
    }

    public String getPositive_votes() {
        return positive_votes;
    }

    public void setPositive_votes(String positive_votes) {
        this.positive_votes = positive_votes;
    }

    public String getPre_game_duration() {
        return pre_game_duration;
    }

    public void setPre_game_duration(String pre_game_duration) {
        this.pre_game_duration = pre_game_duration;
    }

    public String getRadiant_score() {
        return radiant_score;
    }

    public void setRadiant_score(String radiant_score) {
        this.radiant_score = radiant_score;
    }

    public Boolean getRadiant_win() {
        return radiant_win;
    }

    public void setRadiant_win(Boolean radiant_win) {
        this.radiant_win = radiant_win;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getTower_status_dire() {
        return tower_status_dire;
    }

    public void setTower_status_dire(String tower_status_dire) {
        this.tower_status_dire = tower_status_dire;
    }

    public String getTower_status_radiant() {
        return tower_status_radiant;
    }

    public void setTower_status_radiant(String tower_status_radiant) {
        this.tower_status_radiant = tower_status_radiant;
    }
}
