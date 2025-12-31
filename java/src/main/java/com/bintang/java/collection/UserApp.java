package com.bintang.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserApp {
    public static void main(String[] args) {

        List<User> users = List.of(
                new User("Budi", 20, "USER"),
                new User("Ani", 25, "ADMIN"),
                new User("Joko", 25, "USER"),
                new User("Siti", 30, "ADMIN"),
                new User("Nano", 20, "USER")
        );

        // PAKE STREAM
        List<User> result = users.stream()
                .filter(u -> u.getAge() > 22)
                .collect(Collectors.toList());
        System.out.println(result);

        // PAKE FOR
//        List<User> result = new ArrayList<>();
//        for(User u : users){
//            if(u.getAge() > 22){
//                result.add(u);
//            }
//        }
    }
}
