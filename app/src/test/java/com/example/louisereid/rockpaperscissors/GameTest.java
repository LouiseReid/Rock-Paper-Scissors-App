package com.example.louisereid.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by louisereid on 08/11/2017.
 */

public class GameTest {

    Game game;
    ArrayList<Options> testResults;
    Options option1;
    Options option2;
    int playerWins;
    int computerWins;

    @Before
    public void before(){
        game = new Game(option1, option2);
        testResults = new ArrayList<>();
        testResults.add(Options.PAPER);
        testResults.add(Options.ROCK);
        testResults.add(Options.SCISSORS);
        playerWins = 0;
        computerWins = 0;


    }

    @Test
    public void canGenerateResults(){
        assertEquals(3, game.getResult().size());
    }

    @Test
    public void canGetOptionAtIndex(){
        Game game = new Game(testResults);
        assertEquals(Options.PAPER, game.getOptionAtIndex(0));
        assertEquals(Options.ROCK, game.getOptionAtIndex(1));
        assertEquals(Options.SCISSORS, game.getOptionAtIndex(2));
    }

    @Test
    public void canGetRandomResult(){
        Options o = game.getOption();
        assertNotNull(o);
        assert(o instanceof Options);
    }

    @Test
    public void getComputerChoice(){
        Game spy = Mockito.spy(game);
        Mockito.when(spy.computerPick()).thenReturn(Options.PAPER);
        assertEquals(Options.PAPER, spy.computerPick());
    }

    @Test
    public void canCompare(){
        game.setOption1(Options.PAPER);
        game.setOption2(Options.SCISSORS);
        assertEquals("scissors wins", game.compare());
    }

    @Test
    public void canSetOption(){
        game.setOption1(Options.PAPER);
        assertEquals(Options.PAPER, game.getOption1());
    }

    @Test
    public void winsIncrease(){
        game.setOption1(Options.PAPER);
        game.setOption2(Options.SCISSORS);
        game.compare();
        game.setOption1(Options.PAPER);
        game.setOption2(Options.SCISSORS);
        game.compare();
        assertEquals(2, game.computerWins);
    }

}
