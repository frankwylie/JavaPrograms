
public class Hello {

    // Main Java Method:
    public static void main(String[] args) {

        // Lecture 13 - Hello World Code
        System.out.println("Hello, World");
        System.out.println("Hello, Frank");
        //---------------------------------------------------------

        // Lecture 14 - No coding here.
        //---------------------------------------------------------

        // Lecture 15 - Variables (mainly Integer Data Types)
        // Variable - a place in memory that you can store information inside
        // Why use variables? Computer needs to store information for processing information later.

        // 1st example - int (for integer)
        int myFirstNumber = 5; // Java will assign a spot in memory to store the number 5.
        int myFirstNumber1 = 5 + 10; // Java will assign a spot in memory to store the number 15.

        int myFirstNumber2 = (10 + 5) + (2 * 10); // Java will assign a spot in memory to store the sum.
        int mySecondNumber = 12; // Java will assign a spot in memory to store the number 12.
        int myThirdNumber = myFirstNumber2 * 2; // Java will assign a spot in memory to store the number 6.

        // Use sout as the shortcut to print the following line:
        System.out.println(myFirstNumber);
        System.out.println(myFirstNumber1);
        System.out.println(myFirstNumber2);
        System.out.println("myFirstNumber");

        //
        int myTotal = myFirstNumber2 + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        // Note: You can only use myTotal after it's been created / initialized.
        int myFourthNumber = 1000 - myTotal;

        // Lecture Challenge:  Take myTotal and minus from 1000.
        System.out.println(myFourthNumber);

    }
}
