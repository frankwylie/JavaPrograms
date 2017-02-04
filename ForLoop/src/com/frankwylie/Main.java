package com.frankwylie;

public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 1% interst = " + calculateInterest(10000.0, 1.0));
//        System.out.println("10,000 at 2% interst = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interst = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interst = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interst = " + calculateInterest(10000.0, 5.0));

        //for(init; termination; increment)
        for(int i=2; i<9; i++){
            //System.out.println("Loop " + i + " hello!");
            System.out.println("10,000 at " + i + " % interest = "
                    + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("-------------");
        //for(init; termination; increment)
        for(int i=8; i>=2; i--){
            //System.out.println("Loop " + i + " hello!");
            System.out.println("10,000 at " + i + " % interest = "
                    + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        System.out.println("-------------");
        int count = 0;
        for (int i=10; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }



    }




        public static double calculateInterest(double amount, double interestRate){
            double interestCalc = (amount *(interestRate/100));

            return interestCalc;
        }


    // Lecture Challenge 1:
    // Using the for statement, call the calculateInterest method with
    // the amount of 10000 with an interestRate of 2, 3, 4, 5, 6, 7, and 8
    // and print the results to the console window.

    // Lecture Challenge 2:
    // How would you modify the for loop above to do the same thing as
    // shown but to start from 8% and work back to 2%.

    // Lecture Challenge 3 - Prime Numbers:
    // A prime number is a whole number greater than 1
    //
    // Create a for statement using any range of numbers.
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print out AND increment a count of the number of prime numbers found
    // if that count is 3, exit the for loop
    // hint: use the break; statement to exit.


    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }




}
