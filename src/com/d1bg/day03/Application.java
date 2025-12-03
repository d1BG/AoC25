package com.d1bg.day03;

import java.io.*;

public class Application {
    public static void main(String[] args) throws IOException {

        // "/home/deni111bg/IdeaProjects/AoC25/src/com/d1bg/day03/input.txt"
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            int total = 0;
            while ((line = br.readLine()) != null) {
                int secondLargest = 0;
                int firstLargest = 0;
                for (int i = 0; i < line.length()-1 ; i++) {
                    int currFirst = Integer.parseInt(String.valueOf(line.charAt(i)));
                    if  (currFirst > firstLargest && i != line.length() - 1) {
                        firstLargest = currFirst;
                        secondLargest = Integer.parseInt(String.valueOf(line.charAt(i+1)));
                    }

                    for (int j = i+2; j < line.length(); j++) {
                        int currSec = Integer.parseInt(String.valueOf(line.charAt(j)));
                        if (currSec > secondLargest) {
                            secondLargest = currSec;
                        }
                    }
                }
                total += firstLargest * 10 + secondLargest;
            }
            System.out.println(total);
        }
    }
}