package com.d1bg.day02;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {

        // "/home/deni111bg/IdeaProjects/AoC25/src/com/d1bg/day02/input.txt"
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line = br.readLine();
            String[] rangeString = line.split(",");
            long sum = 0;

            for (String s : rangeString) {
                String[] range = s.split("-");
                long start = Long.parseLong(range[0]);
                long end = Long.parseLong(range[1]);

                for (long i = start; i <= end; i++) {
                    String iStr = Long.toString(i);
                    String[] halfs = { iStr.substring(0, iStr.length()/2),  iStr.substring(iStr.length()/2) };
                    if (halfs[0].equals(halfs[1])) {
                        System.out.println(i);
                        sum += i;
                    }
                }
            }

            System.out.println(sum);
        }
    }
}