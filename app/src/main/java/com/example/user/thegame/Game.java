package com.example.user.thegame;

import java.util.ArrayList;

/**
 * Created by user on 10/08/2017.
 */

public class Game {

    private ArrayList<Clue> list;

    public Game() {
        list = new ArrayList<Clue>();
    }

    public void addClue(Clue clue) {
        list.add(clue);
    }

    public ArrayList<Clue> getList() {
        return new ArrayList<Clue>(list);
    }
}
