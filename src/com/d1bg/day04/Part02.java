package com.d1bg.day04;

public class Part02 {
    char[][] grid;
    int paperCollected = 0;
    int paperCollectedLastRun = 0;

    public Part02(char[][] grid, boolean part2) {
        this.grid = grid;
    }

    public int part2Solution() {
        Part01 part2 = new Part01(grid, true);

        do {
            paperCollectedLastRun = paperCollected;
            paperCollected += part2.part1Solution();
        } while (paperCollected > paperCollectedLastRun);

        return paperCollected;
    }
}
