package com.example.louisereid.rockpaperscissors;

/**
 * Created by louisereid on 08/11/2017.
 */

public enum Options {

    ROCK(R.drawable.rock),
    PAPER(R.drawable.paper),
    SCISSORS(R.drawable.scissors);

    private int image;

    Options(int image) {
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }
}
