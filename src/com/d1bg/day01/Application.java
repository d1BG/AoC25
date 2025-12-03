package com.d1bg.day01;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {
        int current = 50;
        int pointsToZero = 0;

        // "/home/deni111bg/IdeaProjects/AoC25/src/com/d1bg/day01/input.txt"
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("R")) {
                    current += Integer.parseInt(line.substring(1));
                } else if (line.startsWith("L")) {
                    current -= Integer.parseInt(line.substring(1));
                }

                current %= 100;

                if  (current == 0) {
                    pointsToZero++;
                }

            }
        }

        System.out.println(pointsToZero);
    }
}
