package com.frankwylie;

public class Main {

    public static void main(String[] args) {
	    // Float is a single precision number
        // Double is a double precision number and is faster on many modern computers. Also, in-built java
        // functions are available.

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue =  " + myIntValue);
        System.out.println("myFloatValue =  " + myFloatValue);
        System.out.println("myDoubleValue =  " + myDoubleValue);

        // Output (no division)
        // myIntValue =  5
        // myFloatValue =  5.0
        // myDoubleValue =  5.0


        // 2nd Output (divided by 3)
        // myIntValue =  1
        // myFloatValue =  1.6666666
        // myDoubleValue =  1.6666666666666667

        // Lecture Challenge:
        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds.
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // Notes: 1 pound is equal to 0.45359237

        double lbs = 200d;
        double kiloConversionFactor = 0.45359237d;
        double kilo = lbs * kiloConversionFactor;
        System.out.println(kilo);







    }
}
