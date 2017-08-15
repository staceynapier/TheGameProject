package com.example.user.thegame;

import android.util.Log;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 10/08/2017.
 */

public class Game implements Serializable{

    private ArrayList<Clue> list;
    private Random random = new Random();

    public Game() {
        list = new ArrayList<Clue>();
    }

    public void addClue(Clue clue) {
        list.add(clue);
    }

    public ArrayList<Clue> getList() {
        return new ArrayList<Clue>(list);
    }

    public Clue getAnswerAtIndex(int index){
        return list.get(index);
    }

    public Clue getRandomClue() {
        Random rand = new Random();
        int listSize = getLength();
        int index  = rand.nextInt(listSize);
        return getAnswerAtIndex(index);
    }

    public void removeClue(Clue clue){
//        list.indexOf(string);
        int i = list.indexOf(clue);
        list.remove(i);
    }

    public Integer getLength() {
        return list.size();
    }

    public void empty() {
        list.clear();
    }


}
