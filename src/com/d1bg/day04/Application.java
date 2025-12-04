package com.d1bg.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IOException {
        char[][] grid = Files.lines(Paths.get(args[0]))
                .map(String::toCharArray)
                .toArray(char[][]::new);


        Part01 part01 = new Part01(grid, false);
        Part02 part02 = new Part02(grid, true);

        System.out.println("Paper collected Part1: " + part01.part1Solution());
        System.out.println("Paper collected Part2: " + part02.part2Solution());
    }
}
