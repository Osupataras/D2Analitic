package com.osypchuk.taras.d2a.model.ListModel;

/**
 * Created by Taras on 30.11.2016.
 */

public class ListItem {

    private String heroImage;
    private String heroName;
    private String lobbyType;
    private String startTime;
    private String win;

    public ListItem(String heroImage, String heroName, String lobbyType, String startTime, String win) {
        this.heroImage = heroImage;
        this.heroName = heroName;
        this.lobbyType = lobbyType;
        this.startTime = startTime;
        this.win = win;
    }

    public String getHeroImage() {
        return heroImage;
    }

    public void setHeroImage(String heroImage) {
        this.heroImage = heroImage;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(String lobbyType) {
        this.lobbyType = lobbyType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }
}
