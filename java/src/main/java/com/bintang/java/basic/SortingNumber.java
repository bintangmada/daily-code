package com.bintang.java.basic;

import java.util.Scanner;

public class SortingNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number and separate with commas : ");
        String input = in.nextLine();

        String[] arrayAngka = input.split(",");
        int[] angka = new int[arrayAngka.length];

        for (int i = 0; i < arrayAngka.length; i++) {
            angka[i] = Integer.parseInt(arrayAngka[i].trim());
        }

        for (int i = 0; i < angka.length - 1; i++) {
            for (int j = 0; j < angka.length - i - 1; j++) {
                if(angka[j] > angka[j+1]){
                    int temp = angka[j];
                    angka[j] = angka[j+1];
                    angka[j+1] = temp;
                }
            }
        }

        for(int x : angka){
            System.out.print(x +" ");
        }

    }
}
