package com.frankwylie;

public class Main {

    public static void main(String[] args) {
        // while statement is for if you don't know how many times to loop through

//        int count = 0;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        // or you can write it like this. (alternative way)
//        while (true) { // means this is an infinite loop!
//            if (count == 5)
//                break;
//        }
//        System.out.println("Count value is " + count);
//        count++;
//
//
//        System.out.println("---------------------------------");
//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        while (count != 6);


        //System.out.println("---------------------------------");
        // Lecture challenge - find even numbers.
        // Create a method called isEvenNumber that takes a parameter of type int
        // Its purpose is to determine if the argument passed to the method is
        // an even number or not.
        // return true if an even number, otherwise return false.

//        int number = 5;
//        int finishNumber = 20;
//        while(number <= finishNumber){
//            if(!isEvenNumber(number)){
//                number++;
//                continue;
//            }
//            System.out.println("Even number " + number);
//            number++;
//        }



        System.out.println("---------------------------------");
        // Lecture challenge - modify the code to indicate the total number of even numbers found.
        // So, modify the while code
        // Make it also record the total number of even numbers it has found and break once after 5 are found.
        // and at the end, display the total number of even numbers found.
        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
            System.out.println("Even number " + number);
            number++;
        }
        System.out.println("Total numbers of even numbers found " + evenNumbersFound);


    }

    public static boolean isEvenNumber(int number){
        if((number % 2) == 0){
            return true;
        }
        return false;
    }






}
