package com.bintang.java.rekursif;

public class MyRekursif {

    public static void main(String[] args) {
        angka(5);
    }

    private static int angka(int n) {

        System.out.print(n + " ");

        if (n == 0) {
            return 0;
        }

        return angka(n - 1);

    }
}
