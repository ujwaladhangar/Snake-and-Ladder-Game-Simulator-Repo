package com.infogalaxy.snakeandladdersimulator;

public class SnakeandLadder {

    //UC-1-game played with single player at start position 0
    int position = 0;

    public void showPosition() {
        System.out.println(" Player position Is : " + position);
    }

    public static void main(String[] args) {
        SnakeandLadder Player = new SnakeandLadder();
        Player.showPosition();
    }
}
