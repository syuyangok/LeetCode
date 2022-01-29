package edu.gatech.dp;
//leetcode 63; dp
//A robot is located at the top-left corner of a m x n grid
//The robot can only move either down or right at any point in time.
//How many possible unique paths to right bottom
public class UniquePaths2 {


    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] dp = new int[row][col];
        if (obstacleGrid[0][0] == 1) return 0;

        for (int i = 0; i <= row - 1; i++) {
            if (obstacleGrid[i][0] == 1) {
                break;
            }
            dp[i][0] = 1;
        }
        for (int j = 0; j <= col - 1; j++) {
            if (obstacleGrid[0][j] == 1) {
                break;
            }
            dp[0][j] = 1;
        }

        for (int i = 1; i <= row - 1; i++) {
            for (int j = 1; j <= col - 1; j++) {
//                if (obstacleGrid[i][j] != 1){
//                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//                }
//                else{
//                    dp[i][j] = 0;
//                }

                dp[i][j] = obstacleGrid[i][j] == 1 ? 0 : dp[i - 1][j] + dp[i][j - 1];

                System.out.print("dp" + i + j + ": "+ dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[row-1][col-1];
    }

    public static void main(String[] args) {
        int[][] array = {{0,0,0},{0,1,0},{0,0,0}};

        int result = uniquePathsWithObstacles(array);

        System.out.println( " Result: " + result);
    }

}
