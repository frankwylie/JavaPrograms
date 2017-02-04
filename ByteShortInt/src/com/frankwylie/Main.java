package com.frankwylie;

public class Main {

    public static void main(String[] args) {

        // INTEGER SUMMARY - int has a width of 32
        int myIntValue = 10000;
        int myIntValue2 = -2147483648; // smallest int value you can use
        int myIntValue3 = 2147483647; // largest int value you can use

        // You can even use underscores to make it more readable!
        int myMinIntValue = -2_147_483_648; // smallest int value you can use
        int myMaxIntValue = 2_147_483_647; // largest int value you can use
        int myTotal = (myMinIntValue/2);
        System.out.println("myTotal =  " + myTotal);

        // Note - Using INT is normally the most common way to go!

        //-----------------------------------------------------------------------------

        // BYTE SUMMARY - byte has a width of 8
        // Now lets move to using bytes data types for smaller numbers
        byte myByteValue = 10; // Byte range = -128 to 127
        byte myNewByteValue = (byte) (myByteValue/2); // Java automatically converts into an integer, so Cast as byte
        System.out.println("myNewByteValue =  " + myNewByteValue);
        // Why use? more efficient because the computer doesn't allocate a lot of memory

        // SHORT SUMMARY - short has a width of 16
        // Now lets move to using short data types for slighly bigger numbers
        short myShortValue = 30000;  // Short range = -32768 to 32767
        System.out.println("myShortValue = " + myShortValue);

        // long has a width of 64 , so double the width of an integer
        long myLongValue = 100L; // when you assign a long value, you need to assign a L afterwards
        long myLongValue2 = -9_223_372_036_854_775_808L;
        long myLongValue3 = 9_223_372_036_854_775_807L;
        System.out.println("myLongValue =  " + myLongValue3/2);

        // Lecture Challenge:
        byte cByteNum = 10;
        short cShortNum = 20;
        int cIntNum = 50;
        long cLontNum = 50000L + 10L * (cByteNum + cShortNum + cIntNum);
        System.out.println(cLontNum);
        // Casting is not necessary in the above example for long
        // try short
        short shortTotal = (short) (1000 + 10 * (cByteNum + cShortNum + cIntNum));
        System.out.println(shortTotal);
        // Casting is necessary for short
    }
}
