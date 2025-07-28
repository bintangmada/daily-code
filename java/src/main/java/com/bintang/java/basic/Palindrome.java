package com.bintang.java.basic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input kata : ");
        String kata = sc.next().toLowerCase();

        int left = 0;
        int right = kata.length() - 1;

        StringBuilder leftChar = new StringBuilder();
        StringBuilder rightChar = new StringBuilder();

        while (left < right) {

            char l = kata.charAt(left);
            char r = kata.charAt(right);

            leftChar.append(l);
            rightChar.append(r);

            left++;
            right--;

        }

        if (leftChar.toString().equals(rightChar.toString())){
            System.out.println("PALINDROME");
        }else{
            System.out.printf("NOT A PALINDROME");
        }
    }
}
