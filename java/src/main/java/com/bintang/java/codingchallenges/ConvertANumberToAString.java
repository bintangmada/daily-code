package com.bintang.java.codingchallenges;

/*We need a function that can transform a number (integer) into a string.
What ways of achieving this do you know?
Examples (input --> output):
        123  --> "123"
        999  --> "999"
        -100 --> "-100"*/

public class ConvertANumberToAString {

    public static void main(String[] args) {
        System.out.println(numberToString(123));
    }

    public static String numberToString(int num){
        // String numberString = Integer.toString(num); --> bener dua duanya
        String numberString = String.valueOf(num);
        return numberString;
    }

}
