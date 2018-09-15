public class minPathSum {
    public static int minPathSum(int[][] grid) {
        int row = grid.length;
        if (row == 0) return 0;
        int column = grid[0].length;
        int[][] dp = new int[row][column];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < row; ++i)
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        for (int j = 1; j < column; ++j)
            dp[0][j] = dp[0][j - 1] + grid[0][j];

        for (int i = 1; i < row; ++i)
            for (int j = 1; j < column; ++j) {
                dp[i][j] = minPath(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }

        return dp[row - 1][column - 1];
    }


    public static int minPath(int a, int b) {
        return a > b ? b : a;
    }

    public static void main(String... args) throws Exception {
        int[][] array = {{0,1},
                {1, 0},
               };
        Info.printInfo(minPathSum(array));

    }
}
