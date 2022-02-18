//695. Max Area of Island


class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int count = 0;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == 1) {
                count = Math.max(count, island(i, j, grid));
            }
        }
    }
    return count;
}

public static int island(int row, int col, int[][] grid) {
    if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
        return 0;
    }
    grid[row][col] = 0;
    return (1 + island(row - 1, col, grid) +
            island(row + 1, col, grid) +
            island(row, col + 1, grid) + 
            island(row, col - 1, grid));

    }
}
