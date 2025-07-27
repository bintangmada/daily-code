package com.bintang.java.basic;

import java.util.Scanner;

public class VowelCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int vowelCount = 0;

        for(int i = 0; i< sentence.length(); i++){
            char c = sentence.charAt(i);
            if(Character.isLetter(c)){
                char vowel = Character.toLowerCase(c);
                if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
                    vowelCount++;
                }
            }
        }

        System.out.println("Vowel count is : "+vowelCount);

    }
}
