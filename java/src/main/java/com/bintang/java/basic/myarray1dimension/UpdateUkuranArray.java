package com.bintang.java.basic.myarray1dimension;

import java.util.Scanner;

public class UpdateUkuranArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] arrayA = new String[3];
        int size = 0;

        for (int i = 0; i < 10; i++) {
            if (size == arrayA.length) {

                String[] newArray = new String[arrayA.length * 2];
                for (int j = 0; j < arrayA.length; j++) {
                    newArray[j] = arrayA[j];
                }
                arrayA = newArray;

                System.out.println("Array diperpanjang menjadi : "+arrayA.length);
            }

            System.out.print("Masukkan buah anda : ");
            String buah = in.nextLine();
            arrayA[i] = buah;
            size++;
        }

        for (String buah : arrayA) {
            System.out.println(buah);
        }
    }
}
