package com.frankwylie;

public class Main {

    public static void main(String[] args) {

        // range is a width of 16 (2 bytes)
        char myChar = 'A';
        // website:   unicode-table.com/en/#control-character
        char myChar2 = '\u00A9';

        System.out.println("Unicode output was:  " + myChar2);

        // --------------
        boolean myBoolean = false;
        boolean isMale = true;




        // ----------------------------------------------
        // Lecture Challenge
        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it to the unicode value for that symbol.
        // 3. Display in on screen.

        char registeredSymbol = '\u00AE';
        System.out.println("Registered Symbol = " + registeredSymbol);

        // Output:
        // Unicode output was:  ©
        // Registered Symbol = ®





    }
}
