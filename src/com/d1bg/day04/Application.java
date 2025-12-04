package com.d1bg.day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws IOException {
        char[][] grid = Files.lines(Paths.get(args[0]))
                .map(String::toCharArray)
                .toArray(char[][]::new);

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

                    if (paperAround < 4) paperCollected++;
                }
            }
        }
        System.out.println("Paper collected: " + paperCollected);
    }

    public static char getSafe(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length) {
            return '.'; // return '.' if out of bounds
        }
        return grid[row][col];
    }
}
