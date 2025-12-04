package com.d1bg.day04;

public class Part02 extends Part01 {
    int paperCollected = 0;
    int paperCollectedLastRun = 0;

    public Part02(char[][] grid, boolean part2) {
        super(grid, part2);
    }

    public int part2Solution() {
        do {
            paperCollectedLastRun = paperCollected;
            paperCollected += part1Solution();
        } while (paperCollected > paperCollectedLastRun);

        return paperCollected;
    }
}
