package com.example.louisereid.rockpaperscissors;

import android.graphics.Region;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by louisereid on 08/11/2017.
 */

public class Game {

    ArrayList<Options> result;
    Options option1;
    Options option2;
    Integer playerWins;
    Integer computerWins;

    public Game(Options option1, Options option2){
        this.option1 = option1;
        this.option2 = option2;
        playerWins = 0;
        computerWins = 0;
        result = new ArrayList<>();
        generateResults();
    }

    public Game(ArrayList<Options> newResults){
        this.result = newResults;
    }

    public ArrayList<Options> getResult() {
        return result;
    }

    public Options getOption1() {
        return option1;
    }

    public void setOption1(Options option1) {
        this.option1 = option1;
    }

    public Options getOption2() {
        return option2;
    }

    public void setOption2(Options option2) {
        this.option2 = option2;
    }

    private int getNumberOfOptions(){
        return result.size();
    }

    private void generateResults(){
        for(Options option : Options.values()){
            result.add(option);
        }
    }

    public Options getOptionAtIndex(int index){
        return result.get(index);
    }

    private int getRandomResult(){
        Random rand = new Random();
        int listSize = getNumberOfOptions();
        int random = rand.nextInt(listSize);
        return random;
    }

    public Options getOption(){
        int index = getRandomResult();
        return getOptionAtIndex(index);
    }

    public Options computerPick(){
        return getOption();
    }

    public String compare(){
        if (option1 == Options.ROCK && option2 == Options.PAPER){
            computerWins ++;
            return "PAPER WINS!";
        }
        if (option1 == Options.PAPER && option2 == Options.ROCK){
            playerWins ++;
            return "PAPER WINS!";
        }
        if (option1 == Options.PAPER && option2 == Options.SCISSORS){
            computerWins ++;
            return "SCISSORS WINS!";
        }
        if (option1 == Options.SCISSORS && option2 == Options.PAPER){
            playerWins ++;
            return "SCISSORS WINS!";
        }
        if (option1 == Options.ROCK && option2 == Options.SCISSORS){
            playerWins ++;
            return "ROCK WINS!";
        }
        if (option1 == Options.SCISSORS && option2 == Options.ROCK){
            computerWins ++;
            return "ROCK WINS!";
        }
        if(option1 == Options.PAPER && option2 == Options.PAPER){
            return "Draw...";
        }
        if(option1 == Options.ROCK && option2 == Options.ROCK){
            return "Draw...";
        } if(option1 == Options.SCISSORS && option2 == Options.SCISSORS){
            return "Draw...";
        }

            return null;
    }
}
