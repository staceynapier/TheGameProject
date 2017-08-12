package com.example.user.thegame;

/**
 * Created by user on 12/08/2017.
 */

public class Team {

    private String name;
    private Integer score;

    public Team(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
