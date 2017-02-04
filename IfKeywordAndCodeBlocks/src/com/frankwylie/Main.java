package com.frankwylie;

public class Main {


    // Using code blocks help make things cleaner and clearer.
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;


        // Lecture Challenge Info:
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);



        //--------------------------------------------------------------
        // Execute the method below called calculateScore.
//        int highScore = calculateScore(true, 800, 5, 100);
//        System.out.println("Your final score was " + highScore);
//
//        calculateScore(true, 10000, 8, 200);

        // Using the if keyword to help test different scenarios
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000");
//        } else if (score < 1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got Here");
//        }

//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        // Scope deals with accessibility of variables

        // Lecture Challenge:
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if(newGameOver == true) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }

        // The next lecture will move from code blocks to methods.
        // Code blocks are a bad way to control code duplication... use a method instead.
        // It is more effort to use code blocks and less effort to use methods.

    }


    // void means don't return anything back.
    //public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

//        if(gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your final score was " + finalScore);
//            return finalScore;
//        } else {
//            return -1;
//        }












   // }

    // -----------------------------------------------------------------
    // Lecture Challenge:
    // it should have a players name as a parameter, and a 2nd parameter as a  position in the high score table.
    // You should display the players name along with a message like " managed to get into position " and
    // the position they got and a further message " on the high score table.
    //
    // Create a 2nd method called calculateHighScorePosition
    // it should be sent one argument only, the player score.
    // it should return an int
    // the return data should be
    // 1 if the score is >= 1000
    // 2 if the score is >= 500 and < 1000
    // 3 if the score is >= 100 and < 500
    // 4 in all other cases.
    // call both methods and display the results of the following:
    // a score of 1500, 900, 400, and 50
    // -----------------------------------------------------------------





    // Method 1
    // note: a void method can also be known as a procedure.
    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
    }


    // Method 2
    public static int calculateHighScorePosition(int playerScore) {

        if(playerScore >= 1000){
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }


}
