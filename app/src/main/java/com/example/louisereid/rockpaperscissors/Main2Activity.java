package com.example.louisereid.rockpaperscissors;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private ImageButton rock;
    private ImageButton paper;
    private ImageButton scissors;
    private TextView resultTxt;
    private ImageView computerPick;
    private Options option1;
    private Options option2;
    private Game game;
    private TextView playerTotal;
    private TextView computerTotal;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        game = new Game(option1, option2);


        rock = (ImageButton)findViewById(R.id.rockBtn);
        paper = (ImageButton)findViewById(R.id.paperBtn);
        scissors = (ImageButton)findViewById(R.id.scissorsBtn);
        resultTxt = (TextView)findViewById(R.id.ResultTxt);
        computerPick = (ImageView)findViewById(R.id.compPick);
        playerTotal = (TextView)findViewById(R.id.playerTotal);
        computerTotal = (TextView)findViewById(R.id.compTotal);
    }

    public void onRockButtonPressed(View button){
        game.setOption1(Options.ROCK);
        game.setOption2(game.computerPick());
        resultTxt.setText(game.compare());
        computerPick.setImageResource(game.getOption2().getImage());
        playerTotal.setText(game.playerWins.toString());
        computerTotal.setText(game.computerWins.toString());
    }

    public void onScissorsButtonPressed(View button){
        game.setOption1(Options.SCISSORS);
        game.setOption2(game.computerPick());
        resultTxt.setText(game.compare());
        computerPick.setImageResource(game.getOption2().getImage());
        playerTotal.setText(game.playerWins.toString());
        computerTotal.setText(game.computerWins.toString());



    }

    public void onPaperButtonPressed(View button){
        game.setOption1(Options.PAPER);
        game.setOption2(game.computerPick());
        resultTxt.setText(game.compare());
        computerPick.setImageResource(game.getOption2().getImage());
        playerTotal.setText(game.playerWins.toString());
        computerTotal.setText(game.computerWins.toString());

    }
}


