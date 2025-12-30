package com.bintang.java.thread;

public class MyThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Hallo dari thread lain"));

        t.start();

        System.out.println("Halo dari main");

        System.out.println("Nama Thread : "+Thread.currentThread().getName());
    }


}
