package com.infogalaxy.snakeandladdersimulator;

import java.util.Random;

public class SnakeandLadder {

    //UC-1-game played with single player at start position 0
    public void showPosition() {
        int position = 0;
        System.out.println(" Player position Is : " + position);
    }

    //UC-2-Player rolls the die to get a number between 1 to 6.
    public void rollDice() {
        int die;
        Random random = new Random();
        die = random.nextInt(6) + 1;
        System.out.println(" Die Number is : " + die);
    }

    public static void main(String[] args) {
        SnakeandLadder Player = new SnakeandLadder();
        Player.showPosition();
        Player.rollDice();

    }
}
