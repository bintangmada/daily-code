package com.bintang.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    public boolean isPalindrome(String value){

        String temp = "";

        for(int i = value.length() - 1; i >= 0; i--){
            temp = temp + value.charAt(i);
        }

        return temp.equals(value);
    }

    @Test
    void testIsPalindrome(){
        Assertions.assertTrue(isPalindrome(""));
        Assertions.assertTrue(isPalindrome("a"));
        Assertions.assertTrue(isPalindrome("aba"));
        Assertions.assertTrue(isPalindrome("kodok"));

        Assertions.assertFalse(isPalindrome("kado"));
        Assertions.assertFalse(isPalindrome("oba"));
        Assertions.assertFalse(isPalindrome("bao"));
        Assertions.assertFalse(isPalindrome("sun"));
    }

}
