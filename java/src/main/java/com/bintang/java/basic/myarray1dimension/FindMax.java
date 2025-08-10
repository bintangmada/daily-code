package com.bintang.java.basic.myarray1dimension;

public class FindMax {
    public static void main (String[] args){
        int[] angka = {200,3,5,6,1,10,20,50};

        int max = angka[0];
        for(int i = 0; i < angka.length; i++){
            if(angka[i] > max){
                max = angka[i];
            }
        }

        System.out.println("angka terbesar : "+max);
    }
}
