package com.d1bg.day04;

public class ArrayHelper {
    public static char getSafe(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[row].length) {
            return '.'; // return '.' if out of bounds
        }
        return grid[row][col];
    }
}
