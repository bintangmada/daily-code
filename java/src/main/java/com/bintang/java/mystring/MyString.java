package com.bintang.java.mystring;

public class MyString {
    public static void main(String[] args) {
//        String a = "java";
//        String b = "Java";
//
//        System.out.println(a==b);
//        System.out.println(a.equals(b));

//        String a = "java";
//        a = a.toUpperCase();
//        System.out.println(a);

        String a = new String("java"); // barang custom
        String b = a.intern(); // gudang standar

        System.out.println(a==b);
        System.out.println(b == "java");
    }
}
