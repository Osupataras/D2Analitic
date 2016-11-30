package com.osypchuk.taras.d2a.model.ApiModelMatchHistory;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Taras on 27.11.2016.
 */

public class Players {

    @SerializedName("account_id")
    private String accountId;
    @SerializedName("player_slot")
    private String playerSlot;
    @SerializedName("hero_id")
    private String heroId;

    public Players(String accountId, String heroId, String playerSlot) {
        this.accountId = accountId;
        this.heroId = heroId;
        this.playerSlot = playerSlot;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getHeroId() {
        return heroId;
    }

    public void setHeroId(String heroId) {
        this.heroId = heroId;
    }

    public String getPlayerSlot() {
        return playerSlot;
    }

    public void setPlayerSlot(String playerSlot) {
        this.playerSlot = playerSlot;
    }

    @Override
    public String toString() {
        return "Players{" +
                "accountId='" + accountId + '\'' +
                ", playerSlot='" + playerSlot + '\'' +
                ", heroId='" + heroId + '\'' +
                '}';
    }
}
