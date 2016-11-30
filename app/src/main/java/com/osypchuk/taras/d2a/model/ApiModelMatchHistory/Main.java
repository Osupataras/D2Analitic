package com.osypchuk.taras.d2a.model.ApiModelMatchHistory;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Taras on 29.11.2016.
 */

public class Main {
    @SerializedName("result")
    private Result main;

    public Result getMain() {
        return main;
    }

    public void setMain(Result main) {
        this.main = main;
    }

    public Main(Result main) {

        this.main = main;
    }

    @Override
    public String toString() {
        return "Main{" +
                "main=" + main +
                '}';
    }
}

