package com.d1bg.day04;

import static com.d1bg.day04.ArrayHelper.getSafe;

public class Part01 {
    char[][] grid;
    boolean part2;

    public Part01(char[][] grid, boolean part2) {
        this.grid = grid;
        this.part2 = part2;
    }

    public int part1Solution() {
        int paperCollected = 0;

        for  (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int paperAround = 0;
                if (grid[i][j] == '@') {
                    // top row
                    if (getSafe(grid, i-1, j-1) == '@') paperAround++;
                    if (getSafe(grid, i-1, j) == '@') paperAround++;
                    if (getSafe(grid, i-1, j+1) == '@') paperAround++;

                    // mid row
                    if (getSafe(grid, i, j-1) == '@') paperAround++;
                    if (getSafe(grid, i, j+1) == '@') paperAround++;

                    // bottom row
                    if (getSafe(grid, i+1, j-1) == '@') paperAround++;
                    if (getSafe(grid, i+1, j) == '@') paperAround++;
                    if (getSafe(grid, i+1, j+1) == '@') paperAround++;

                    if (paperAround < 4) {
                        paperCollected++;
                        if (part2) {
                            grid[i][j] = '.';
                        }
                    }
                }
            }
        }
        return paperCollected;
    }
}
