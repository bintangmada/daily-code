package com.bintang.java.regex;

public class MyRegex {
    public static void main(String[] args) {
        String input = "I love Love to To tO code";

        // Regex untuk menghapus kata yang berulang (case-insensitive)
        String regex = "\\b(\\w+)\\b(\\s+\\1\\b)+";

        // Ganti kata duplikat dengan satu kata saja
        String result = input.replaceAll("(?i)" + regex, "$1");

        System.out.println("Input  : " + input);
        System.out.println("Output : " + result);
    }
}
