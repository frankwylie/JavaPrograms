package com.frankwylie;

public class Main {

    public static void main(String[] args) {
	// Introduction to String Class:
        // The String is the 9th datatype.  (non-primitive type)
        // A string can contain a sequence of characters.

        // String Basics with appending example using the plus operator.
        // There are other ways to add to a string, this is just an example.
        String myString = "This is a String";
        System.out.println("myString is equal to: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to: " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to: " + myString);

        // Output:
        // myString is equal to This is a String
        // myString is equal to This is a String, and this is more.
        // myString is equal to This is a String, and this is more. © 2015


        // String Basics using numbers.
        // String datatype deals with textual data only.  no math operations.
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);

        // Output:
        // The result is 250.5549.95



        // String Basics using different datatypes.
        // Java converts looks at the contents and converts to a string.  Treated purely as text.
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

        // Output:
        // LastString is equal to 1050
        // LastString is equal to 1050120.47



    }
}
