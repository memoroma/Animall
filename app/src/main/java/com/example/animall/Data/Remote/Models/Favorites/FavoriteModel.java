package com.example.animall.Data.Remote.Models.Favorites;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FavoriteModel {
    @SerializedName("result")
    @Expose
    private Result result;
    @SerializedName("statue")
    @Expose
    private String statue;


    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public String getStatue() {
        return statue;
    }

    public void setStatue(String statue) {
        this.statue = statue;
    }
}
