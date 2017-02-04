package com.frankwylie;

public class Main {

    // Overloading - using the same method name, but with different number of parameters
    // the overloaded method will have a unique method signature.
    public static void main(String[] args) {
//        int newScore = calculateScore("Tim", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();

        double centimeters = calcFeetAndInchesToCentimeters(20, 13);
        if(centimeters < 0.0){
            System.out.println("Invalid Parameters");
        }

        calcFeetAndInchesToCentimeters(-10);

    }

    // Method 1 - with 2 parameters
//    public static int calculateScore(String playerName, int score) {
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score;
//    }


    // Method 2 - with 1 parameter
//    public static int calculateScore(int score) {
//        System.out.println("Unnamed Player Scored " + score + " points");
//        return score;
//    }

    // Method 3 - with 0 parameter
//    public static int calculateScore() {
//        System.out.println("No Player Named, No Player Scored");
//        return 0;
//    }


    // ____________________________________________________
    // Lecture Challenge (Overloading Methods):


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
       // Simple validation
        if((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet or inches parameters");
            return -1; // returning -1 is a good way to check for validation.
        }

        // calculate centimeters.
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        // Simple validation
        if(inches < 0){
            System.out.println("Invalid inches parameters");
            return -1; // returning -1 is a good way to check for validation.
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

}
