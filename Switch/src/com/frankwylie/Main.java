package com.frankwylie;

public class Main {

    public static void main(String[] args) {

//        int value = 1;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if ( value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }


        // Switch is good to use if you have many different values.
        int switchValue = 1;
        switch(switchValue){
            case 1:
                System.out.println("value was 1");
                break; // if breaks, then it will got to more code here.
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break; // breaks are vital to close off the case. If no break, it will continue to next case.
            default:
                System.out.println("Was not 1 or 2");
                break; // technically, we could remove the final break since it's the last line
        }

            // more code here.

        //---------------------------------------------------------
        // Lecture Challenge:
        // Create a new switch statement using char instead of int.
        // Create a new char variable.
        // Create a switch statement testing for
        // A, B, C, D, or E
        // Display a message if any of these are found and then break.
        // Add a default which displays a message saying not found.

        char switchValue2 = 'B'; // With Char, you need to use single quotes to define a char.
        switch(switchValue2){
            case 'A':
                System.out.println("char was A");
                break; // if breaks, then it will got to more code here.
            case 'B':
                System.out.println("char was B");
                break;
            case 'C':
                System.out.println("char was C");
                break;
            case 'D':
                System.out.println("char was D");
                break;
            case 'E':
                System.out.println("char was E");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break; // technically, we could remove the final break since it's the last line
        }

        // more code here.

        char switchValue3 = 'G'; // With Char, you need to use single quotes to define a char.
        switch(switchValue3){
            case 'A':
                System.out.println("char was A");
                break; // if breaks, then it will got to more code here.
            case 'B':
                System.out.println("char was B");
                break;
            case 'C':case 'D':case 'E':
                System.out.println(switchValue3 + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break; // technically, we could remove the final break since it's the last line
        }

        // more code here.


        String month = "January";
        switch(month.toLowerCase()){ // add lower case to ensure it will work.
            case "january":
                System.out.println("Jan");
                break; // if breaks, then it will got to more code here.
            case "june":
                System.out.println("June");
                break; // if breaks, then it will got to more code here.
            default:
                System.out.println("Not Sure");
                break; // technically, we could remove the final break since it's the last line
        }






    }
}
