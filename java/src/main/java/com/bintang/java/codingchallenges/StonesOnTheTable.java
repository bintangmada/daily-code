package com.bintang.java.codingchallenges;

/*There are some stones on Bob's table in a row, and each of them can be red, green or blue, indicated by the characters R, G, and B.
    Help Bob find the minimum number of stones he needs to remove from the table so that the stones in each pair of adjacent stones have different colors.
    Examples:
            "RGBRGBRGGB"   => 1
            "RGGRGBBRGRR"  => 3
            "RRRRGGGGBBBB" => 9*/
public class StonesOnTheTable {

    public static void main(String[] args) {

        System.out.println(countRemovedStone("RRRRGGGGBBBB"));

    }

    public static int countRemovedStone(String stones) {

        int countRemovedStone = 0;
        stones = stones.toLowerCase();
        char[] kataArray = new char[stones.length()];

        for (int i = 0; i < stones.length(); i++) {
            kataArray[i] = stones.charAt(i);
        }

        for (int i = 0; i < kataArray.length-1; i++) {
            if (kataArray[i] == kataArray[i + 1]) {
                countRemovedStone += 1;
            }
        }

        return countRemovedStone;
    }

}
