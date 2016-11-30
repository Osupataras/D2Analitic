package com.osypchuk.taras.d2a.model.ApiModelMatchDetails;

import java.util.List;

/**
 * Created by Taras on 30.11.2016.
 */

public class Players {
    private String account_id;
    private String player_slot;
    private String hero_id;
    private String item_0;
    private String item_1;
    private String item_2;
    private String item_3;
    private String item_4;
    private String item_5;
    private String kills;
    private String deaths;
    private String assists;
    private String leaver_status;
    private String last_hits;
    private String denies;
    private String gold_per_min;
    private String xp_per_min;
    private String level;
    private String hero_damage;
    private String tower_damage;
    private String hero_healing;
    private String gold;
    private String gold_spent;
    private String scaled_hero_damage;
    private String scaled_tower_damage;
    private String scaled_hero_healing;
    private List<Ability_updates> bility_upgrades;

    public Players(String account_id, String assists, List<Ability_updates> bility_upgrades, String deaths, String denies, String gold, String gold_per_min, String gold_spent, String hero_damage, String hero_healing, String hero_id, String item_0, String item_1, String item_2, String item_3, String item_4, String item_5, String kills, String last_hits, String leaver_status, String level, String player_slot, String scaled_hero_damage, String scaled_hero_healing, String scaled_tower_damage, String tower_damage, String xp_per_min) {
        this.account_id = account_id;
        this.assists = assists;
        this.bility_upgrades = bility_upgrades;
        this.deaths = deaths;
        this.denies = denies;
        this.gold = gold;
        this.gold_per_min = gold_per_min;
        this.gold_spent = gold_spent;
        this.hero_damage = hero_damage;
        this.hero_healing = hero_healing;
        this.hero_id = hero_id;
        this.item_0 = item_0;
        this.item_1 = item_1;
        this.item_2 = item_2;
        this.item_3 = item_3;
        this.item_4 = item_4;
        this.item_5 = item_5;
        this.kills = kills;
        this.last_hits = last_hits;
        this.leaver_status = leaver_status;
        this.level = level;
        this.player_slot = player_slot;
        this.scaled_hero_damage = scaled_hero_damage;
        this.scaled_hero_healing = scaled_hero_healing;
        this.scaled_tower_damage = scaled_tower_damage;
        this.tower_damage = tower_damage;
        this.xp_per_min = xp_per_min;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getAssists() {
        return assists;
    }

    public void setAssists(String assists) {
        this.assists = assists;
    }

    public List<Ability_updates> getBility_upgrades() {
        return bility_upgrades;
    }

    public void setBility_upgrades(List<Ability_updates> bility_upgrades) {
        this.bility_upgrades = bility_upgrades;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getDenies() {
        return denies;
    }

    public void setDenies(String denies) {
        this.denies = denies;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getGold_per_min() {
        return gold_per_min;
    }

    public void setGold_per_min(String gold_per_min) {
        this.gold_per_min = gold_per_min;
    }

    public String getGold_spent() {
        return gold_spent;
    }

    public void setGold_spent(String gold_spent) {
        this.gold_spent = gold_spent;
    }

    public String getHero_damage() {
        return hero_damage;
    }

    public void setHero_damage(String hero_damage) {
        this.hero_damage = hero_damage;
    }

    public String getHero_healing() {
        return hero_healing;
    }

    public void setHero_healing(String hero_healing) {
        this.hero_healing = hero_healing;
    }

    public String getHero_id() {
        return hero_id;
    }

    public void setHero_id(String hero_id) {
        this.hero_id = hero_id;
    }

    public String getItem_0() {
        return item_0;
    }

    public void setItem_0(String item_0) {
        this.item_0 = item_0;
    }

    public String getItem_1() {
        return item_1;
    }

    public void setItem_1(String item_1) {
        this.item_1 = item_1;
    }

    public String getItem_2() {
        return item_2;
    }

    public void setItem_2(String item_2) {
        this.item_2 = item_2;
    }

    public String getItem_3() {
        return item_3;
    }

    public void setItem_3(String item_3) {
        this.item_3 = item_3;
    }

    public String getItem_4() {
        return item_4;
    }

    public void setItem_4(String item_4) {
        this.item_4 = item_4;
    }

    public String getItem_5() {
        return item_5;
    }

    public void setItem_5(String item_5) {
        this.item_5 = item_5;
    }

    public String getKills() {
        return kills;
    }

    public void setKills(String kills) {
        this.kills = kills;
    }

    public String getLast_hits() {
        return last_hits;
    }

    public void setLast_hits(String last_hits) {
        this.last_hits = last_hits;
    }

    public String getLeaver_status() {
        return leaver_status;
    }

    public void setLeaver_status(String leaver_status) {
        this.leaver_status = leaver_status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPlayer_slot() {
        return player_slot;
    }

    public void setPlayer_slot(String player_slot) {
        this.player_slot = player_slot;
    }

    public String getScaled_hero_damage() {
        return scaled_hero_damage;
    }

    public void setScaled_hero_damage(String scaled_hero_damage) {
        this.scaled_hero_damage = scaled_hero_damage;
    }

    public String getScaled_hero_healing() {
        return scaled_hero_healing;
    }

    public void setScaled_hero_healing(String scaled_hero_healing) {
        this.scaled_hero_healing = scaled_hero_healing;
    }

    public String getScaled_tower_damage() {
        return scaled_tower_damage;
    }

    public void setScaled_tower_damage(String scaled_tower_damage) {
        this.scaled_tower_damage = scaled_tower_damage;
    }

    public String getTower_damage() {
        return tower_damage;
    }

    public void setTower_damage(String tower_damage) {
        this.tower_damage = tower_damage;
    }

    public String getXp_per_min() {
        return xp_per_min;
    }

    public void setXp_per_min(String xp_per_min) {
        this.xp_per_min = xp_per_min;
    }
}
