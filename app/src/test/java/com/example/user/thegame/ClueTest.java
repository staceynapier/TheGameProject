package com.example.user.thegame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 10/08/2017.
 */

public class ClueTest {

    Clue clue;

    @Before
    public void before(){
        clue = new Clue("Donald Trump");
    }

    @Test
    public void hasName(){
        assertEquals("Donald Trump", clue.getName());
    }

}
