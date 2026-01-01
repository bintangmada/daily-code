package com.bintang.java.stream.mystream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLatihan {
    public static void main(String[] args) {

        // LIST ANGKA
        List<Integer> listAngka = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // 1. FILTER ANGKA GENAP
        List<Integer> genap = listAngka
                .stream()
                .filter(a -> a % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("INI STREAM FILTER : " + genap);

        // 2. MAP
        List<Integer> kaliSepuluh = listAngka
                .stream()
                .map(a -> a * 10)
                .collect(Collectors.toList());
        System.out.println("INI STREAM MAP : " + kaliSepuluh);

        // 3. KOMBINASI FILTER MAP
        List<Integer> hasil = listAngka
                .stream()
                .filter(a -> a % 2 != 0)
                .map(b -> b * b)
                .collect(Collectors.toList());
        System.out.println("INI KOMBINASI FILTER MAP : " + hasil);

        // 4. HITUNG BERAPA BANYAK
        long jumlah = listAngka
                .stream()
                .filter(a -> a > 3)
                .count();
        System.out.println("JUMLAH ANGKA > 3 : " + jumlah);

        // 5. TES PRINT
        listAngka.stream()
                .forEach(a -> System.out.println(a));

        listAngka.stream()
                .filter(a -> {
                    System.out.println("filter : " + a);
                    return a % 2 == 0;
                })
                .map(a -> {
                    System.out.println("map : " + a);
                    return a * 10;
                })
                .findFirst();

    }
}
