package com.example.user.thegame;

import android.util.Log;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 10/08/2017.
 */

public class GameTest {

    Game game;

    @Before
    public void before(){
        Clue clue = new Clue("Donald Trump");
        Clue clue1 = new Clue("Theresa May");
        Clue clue2 = new Clue("Kim Jong Un");
        game = new Game();
        game.addClue(clue);
        game.addClue(clue1);
        game.addClue(clue2);
    }

    @Test
    public void hasList(){
        assertEquals(3, game.getList().size());
    }

    @Test
    public void testLength(){
        assertEquals((Integer)3, game.getLength());
    }

    @Test
    public void canEmptyList(){
        game.empty();
        assertEquals(0, game.getList().size());
    }

    @Test
    public void canGetAnswerAtIndex(){
        Clue result = game.getAnswerAtIndex(1);
        assertEquals("Theresa May", result.getName());
    }

    @Test
    public void canGetRandomClue(){
        assertNotNull(game.getRandomClue());
    }

    @Test
    public void canRemoveAtIndex() {
        Clue clue = new Clue("Donald Trump");
        Clue clue1 = new Clue("Theresa May");
        Clue clue2 = new Clue("Kim Jong Un");
        game = new Game();
        game.addClue(clue);
        game.addClue(clue1);
        game.addClue(clue2);
        game.removeClue(clue2);
        assertEquals((Integer)2, game.getLength());
    }
}
