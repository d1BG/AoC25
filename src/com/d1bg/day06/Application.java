package com.d1bg.day06;

import java.io.*;
import java.util.*;

public class Application {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            List<List<String>> data = new ArrayList<>();
            long total = 0;

            String line;
            while ((line = br.readLine()) != null) {
                data.add(Arrays.asList(line.split(" +")));
            }

            for (int i = 0; i < data.getFirst().size(); i++) {
                long current = 0;
                switch (data.getLast().get(i)) {
                    case "+":
                        for (int j = 0; j < data.size()-1; j++) {
                            current += Long.parseLong(data.get(j).get(i));
                        }
                        break;
                    case "*":
                        current = 1;
                        for (int j = 0; j < data.size()-1; j++) {
                            current *= Long.parseLong(data.get(j).get(i));
                        }
                        break;
                    default:
                        System.out.println("error??");
                }
                total += current;
            }
            System.out.println(total);
        }
    }
}
