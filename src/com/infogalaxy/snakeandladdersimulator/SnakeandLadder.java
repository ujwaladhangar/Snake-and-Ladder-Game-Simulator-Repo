package com.infogalaxy.snakeandladdersimulator;

public class SnakeandLadder {

    //UC-1-game played with single player at start position 0
    //Position of Player
    int position = 0;
    //Define Constant for Options
    final int NO_PLAY = 1;
    final int LADDER = 2;
    final int SNAKE = 3;

    //Showing the Player current position
    public void showPosition() {
        System.out.println(" Player position is : " + position);
    }

    //UC-2-Player rolls the die to get a number between 1 to 6.
    public void rollDie() {
        int dieNo = (int) ((Math.random() * 6 - 1) + 1);
        System.out.println(" Die Number is : " + dieNo);

        //UC-3-Checking for Options to Play
        int option = (int) ((Math.random() * 3 - 1) + 1);
        System.out.println(" Option No : " + option);
        switch (option) {
            case NO_PLAY:
                System.out.println(" No Play Arrived. Stay On Same Position ");
                break;
            case LADDER:
                System.out.println(" HURRAY !!! You got Ladder. ");
                position = position + dieNo;
                break;
            case SNAKE:
                System.out.println(" OOPS !!! You got Snake. ");
                position = position - dieNo;
                break;
        }
    }

    public static void main(String[] args) {
        //Creating Player1 Object
        SnakeandLadder Player1 = new SnakeandLadder();
        //Showing Player1 Position
        Player1.showPosition();
        //Rolling the Die
        Player1.rollDie();
        Player1.showPosition();
    }
}
