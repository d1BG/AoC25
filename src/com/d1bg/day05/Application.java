package com.d1bg.day05;

import java.io.*;
import java.util.*;

public class Application {
    public static void main(String[] args) throws IOException {
        // "/home/deni111bg/IdeaProjects/AoC25/src/com/d1bg/day05/input.txt"
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            int total = 0;
            List<String> ranges = new ArrayList<>();
            List<String> ids = new ArrayList<>();
            while (!Objects.equals(line = br.readLine(), "")) {
                ranges.add(line);
            }
            while ((line = br.readLine()) != null) {
                ids.add(line);
            }

            for (String idStr : ids) {
                long id = Long.parseLong(idStr);
                for (String range : ranges) {
                    String[] currRange = range.split("-");
                    if (id >= Long.parseLong(currRange[0]) && id <= Long.parseLong(currRange[1])) {
                        total++;
                        break;
                    }
                }
            }
            System.out.println(total);
        }
    }
}

