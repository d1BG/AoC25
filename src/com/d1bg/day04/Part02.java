package com.d1bg.day04;

public class Part02 extends Part01 {
    int paperCollected = 0;
    int paperCollectedLastRun = 0;

    public Part02(char[][] grid) {
        super(grid);
    }

    public int part2Solution() {
        do {
            paperCollectedLastRun = paperCollected;
            paperCollected += part1Solution();
        } while (paperCollected > paperCollectedLastRun);

        return paperCollected;
    }
}
