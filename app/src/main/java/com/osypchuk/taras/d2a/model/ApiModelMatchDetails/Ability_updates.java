package com.osypchuk.taras.d2a.model.ApiModelMatchDetails;

/**
 * Created by Taras on 30.11.2016.
 */

public class Ability_updates {

    private String ability;
    private String time;
    private String level;

    public Ability_updates(String ability, String level, String time) {
        this.ability = ability;
        this.level = level;
        this.time = time;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
