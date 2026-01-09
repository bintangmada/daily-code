package com.bintang.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest2 {

    public boolean isPalindrome(String value) {

        for (int i = 0; i < value.length() / 2; i++) {

            int awal = i;
            int akhir = value.length() - 1 - i;

            // System.out.println(value.charAt(awal) + " : " + value.charAt(akhir));

            if (value.charAt(awal) != value.charAt(akhir)) {
                return false;
            }

        }

        return true;
    }

    @Test
    void testIsPalindrome() {
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
