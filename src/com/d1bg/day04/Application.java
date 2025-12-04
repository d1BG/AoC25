package com.d1bg.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.d1bg.day04.Part01.Part01;
import static com.d1bg.day04.Part02.Part02;


public class Application {
    public static void main(String[] args) throws IOException {
        char[][] grid = Files.lines(Paths.get(args[0]))
                .map(String::toCharArray)
                .toArray(char[][]::new);

        System.out.println("Paper collected Part1: " + Part01(grid));
        System.out.println("Paper collected Part2: " + Part02(grid));
    }
}
