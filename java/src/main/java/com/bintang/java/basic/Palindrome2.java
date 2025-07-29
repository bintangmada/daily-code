package com.bintang.java.basic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input kata : ");
        String kata = sc.next().toLowerCase();

        int left = 0;
        int right = kata.length() - 1;
        boolean isPalindrome = true;

        while(left < right){

            char x = kata.charAt(left);
            char y = kata.charAt(right);

            if (x != y){
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if(isPalindrome){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT A PALINDROME");
        }
    }
}
