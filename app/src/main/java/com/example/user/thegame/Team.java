package com.example.user.thegame;

import java.io.Serializable;

/**
 * Created by user on 12/08/2017.
 */

public class Team implements Serializable{

    private String name;
    private Integer score;

    public Team(String name) {
        this.name = name;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score.toString();
    }

    public int addToScore(int i) {
        Integer newScore = this.score += i;
        return newScore;
    }
}
