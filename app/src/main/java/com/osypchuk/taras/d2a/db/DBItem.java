package com.osypchuk.taras.d2a.db;

/**
 * Created by Taras on 30.11.2016.
 */

public class DBItem {

    private int ID;
    private String HERO_NAME;
    private String HERO_NAME_FULL;

    public DBItem() {
    }

    public DBItem(int ID,String HERO_NAME,String HERO_NAME_FULL) {
        this.HERO_NAME = HERO_NAME;
        this.HERO_NAME_FULL = HERO_NAME_FULL;
        this.ID = ID;
    }

    public String getHERO_NAME() {
        return HERO_NAME;
    }

    public void setHERO_NAME(String HERO_NAME) {
        this.HERO_NAME = HERO_NAME;
    }

    public String getHERO_NAME_FULL() {
        return HERO_NAME_FULL;
    }

    public void setHERO_NAME_FULL(String HERO_NAME_FULL) {
        this.HERO_NAME_FULL = HERO_NAME_FULL;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
