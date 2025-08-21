package com.bintang.java.codingchallenges;

/*We need a function that can transform a string into a number. What ways of achieving this do you know?

Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.

Examples
"1234" --> 1234
        "605"  --> 605
        "1405" --> 1405
        "-7" --> -7*/

public class ConvertAStringToANumber {
    public static void main(String[] args) {
        System.out.println(stringToNumber("123"));
    }

    public static int stringToNumber(String input){
        int result = Integer.parseInt(input);
        return result;
    }
}
