package com.bintang.java.codingchallenges;

/*Can you find the needle in the haystack?

Write a function findNeedle() that takes an array full of junk but containing one "needle"

After your function finds the needle it should return a message (as a string) that says:

        "found the needle at position " plus the index it found the needle, so:

Example(Input --> Output)

["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
Note: In COBOL, it should return "found the needle at position 6"*/
public class ANeedleInTheHaystack {
    public static void main(String[] args) {
        Object[] haystack = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};
        System.out.println(findNeedle(haystack));
    }

    public static String findNeedle(Object[] haystack){

        for(int i = 0; i < haystack.length; i++){
            if("needle".equals(haystack[i])){
                return "found the needle at position " + i;
            }
        }

        return "";
    }
}
