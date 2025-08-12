package com.bintang.java.codingchallenges;

public class MakeNegative {

    public static void main(String[] args) {

        System.out.println(makeNegative(-2));

    }

    public static int makeNegative(final int x){
        int angka = 0;
        if(x < 0){
            angka = x;
        }else if(x == 0){
            angka = 0;
        }else{
            angka = x * -1;
        }
        return angka;
    }
}
