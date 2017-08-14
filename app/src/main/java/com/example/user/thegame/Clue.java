package com.example.user.thegame;

import java.io.Serializable;

/**
 * Created by user on 10/08/2017.
 */

public class Clue implements Serializable{

    private String name;

    public Clue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
