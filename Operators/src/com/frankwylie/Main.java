package com.frankwylie;

public class Main {

    public static void main(String[] args) {
        // Operators are special symbols that perform an operation and then return a result.

        int result = 1 + 2;  // result = 3, so 3 is assigned to the variable named result.
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 " + result);

        previousResult = result;

        result = result/5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;

        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *=10;
        System.out.println("Result is now " + result);
        result -=10;
        System.out.println("Result is now " + result);
        result /=10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an Alien!");

        int topScore = 80;
        if (topScore < 100)
            System.out.println("You got the high score!");


        // With && operator, both conditions need to be TRUE.
        int secondTopScore = 60;
        // it's a good idea to put a bracket around each condition.
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater then second top score and less than 100");

        // With the || operator, only one condition will need to be TRUE.
        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)  // must be assigned using the == operator. So, you can not use =.
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar == true) // you can also use by default if(isCar) with no condition stated.
            System.out.println("This is not supposed to happen");

        // Shortcut using the ternary operator.
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar)
            System.out.println("wasCar is true");

        // nuts and bolts ops summary
        // Tim B. goes to a simple operator website.
        // Go to resources for operator table.


        // Lecture Challenge.
        // 1.
        // 2.
        // 3.
        // 4.
        // 5.
                // if the remaining total (#4) is equal to 20 or less.

        // Note: Operator precedence.
        // Do everything in the brackets first as it's the highest.
        // Then complete the calculations.

        double myFirstValue = 20;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        double theRemainder = myTotal % 40;
        if (theRemainder <= 20)
            System.out.println("Total was over the limit");






















    }
}
