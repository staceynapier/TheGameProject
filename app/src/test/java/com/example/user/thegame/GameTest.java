package com.example.user.thegame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/08/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before(){
        Clue clue = new Clue("Donald Trump");
        game = new Game();
        game.addClue(clue);
    }

    @Test
    public void hasList(){
        assertEquals(1, game.getList().size());
    }

}
