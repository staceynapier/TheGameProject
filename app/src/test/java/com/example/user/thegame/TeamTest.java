package com.example.user.thegame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 12/08/2017.
 */

public class TeamTest {

    Team team;

    @Before
    public void before(){
        team = new Team("TeamName");
    }

    @Test
    public void hasTeamName(){
        assertEquals("TeamName", team.getName());
    }

    @Test
    public void hasTeamScore(){
        assertEquals(0, team.getScore());
    }

    @Test
    public void canAddToScore(){
        team.addToScore(1);
        assertEquals("1", team.getScore());
    }
}
