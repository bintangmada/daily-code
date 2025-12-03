package com.bintang.java.stream.Task;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) {

        List<Task> tasks = List.of(
                new Task("Budi", 5),
                new Task("Andi", 4),
                new Task("Eko", 6),
                new Task("Eko", 5),
                new Task("Andi", 2),
                new Task("Budi", 7)
        );

        Map<String, Integer> orangDanJam = tasks
                .stream()
                .collect(Collectors.groupingBy(
                        Task::getPekerja,
                        Collectors.summingInt(Task::getJamKerja)
                ));

        orangDanJam.forEach((orang, jam) -> System.out.printf("%-10s : %d jam%n", orang, jam));

    }
}
