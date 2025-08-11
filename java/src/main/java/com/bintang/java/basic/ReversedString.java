package com.bintang.java.basic;

public class ReversedString {
    public static void main(String[] args) {
        String kata = "Hallo Bandung";
        String reversedKata = "";

        for(int i = kata.length() - 1; i >= 0; i--){
            reversedKata += kata.charAt(i);
        }

        System.out.println(reversedKata);
    }
}
