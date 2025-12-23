package com.bintang.java.oop;

public class HewanApps {

    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan burung = new Burung();
        System.out.println(kucing.makanan());
        System.out.println(burung.makanan());
    }
}
