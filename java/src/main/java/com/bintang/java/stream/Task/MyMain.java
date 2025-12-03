package com.bintang.java.stream.Task;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Bintang", 3),
                new Task("Mada", 2),
                new Task("Suharsono", 5),
                new Task("Bintang", 2),
                new Task("Mada", 3),
                new Task("Suharsono", 2)
        );


        Map<String, Integer> orangDanJamKerja = tasks
                .stream()
                .collect(Collectors.groupingBy(
                        Task::getNamaOrang,
                        Collectors.summingInt(Task::getJamKerja))
                );

        // V1
        orangDanJamKerja
                .entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() +" : "+e.getValue()+" jam"));

        System.out.println();

        // V2
        orangDanJamKerja.forEach((orang, jam) -> System.out.printf("%-10s : %d jam%n", orang, jam));


    }
}
