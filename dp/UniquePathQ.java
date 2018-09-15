public class UniquePathQ {

//    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int row = obstacleGrid.length;
//        if (row == 0) {
//            return 0;
//        } else if (row == 1) {
//            for (int j = 0; j < obstacleGrid[0].length; ++j) {
//                if (obstacleGrid[0][j] == 1) return 0;
//            }
//            return 1;
//        } else {
//            if (obstacleGrid[0].length == 1) {
//                for (int i = 0; i < obstacleGrid.length; ++i) {
//                    if (obstacleGrid[i][0] == 1) return 0;
//                }
//                return 1;
//            } else {
//                int column = obstacleGrid[0].length;
//                int[][] dp = new int[row][column];
//                for (int i = 0; i < row; ++i)
//                    for (int j = 0; j < column; ++j) {
//                        if ((i == 0 || j == 0)) {
//                            if (obstacleGrid[i][j] != 1)
//                                dp[i][j] = 1;
//                            else dp[i][j] = 0;
//                        } else {
//                            if (obstacleGrid[i - 1][j] != 1 && obstacleGrid[i][j - 1] != 1) {
//                                if (obstacleGrid[i][j] != 1)
//                                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//                                else dp[i][j] = 0;
//
//                            } else if (obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] != 1) {
//                                if (obstacleGrid[i][j] != 1)
//                                    dp[i][j] = dp[i][j - 1];
//                                else dp[i][j] = 0;
//
//                            } else if (obstacleGrid[i - 1][j] != 1 && obstacleGrid[i][j - 1] == 1) {
//                                if (obstacleGrid[i][j] != 1)
//                                    dp[i][j] = dp[i - 1][j];
//                                else dp[i][j] = 0;
//                            } else {
//                                dp[i][j] = 0;
//                            }
//                        }
//                    }
//                    return dp[row-1][column-1];
//
//            }
//        }
//    }

    //dp+减枝
    public static int uniquePathsWithObstacles(int[][] obstacleGrid){
        int row=obstacleGrid.length;
        if(row==0)return 0;
        else {
            int column=obstacleGrid[0].length;
            int[][] dp=new int[row][column];
            int i,j;
            for( i=0;i<row;++i){
                if(obstacleGrid[i][0]==0)dp[i][0]=1;
                else {
                    break;
                }
            }
            for(int m=i;m<row;++m)dp[m][0]=0;
            for( j=0;j<column;++j){
                if(obstacleGrid[0][j]==0)dp[0][j]=1;
                else {
                    break;
                }
            }
            for(int n=j;n<column;++n)dp[0][n]=0;


            for(int r=1;r<row;++r)
                for(int c=1;c<column;++c)
                {
                   if(obstacleGrid[r][c]!=1)dp[r][c]=dp[r-1][c]+dp[r][c-1];
                   else dp[r][c]=0;
                }
                return dp[row-1][column-1];
        }
    }

    public static void main(String... args) throws Exception {
        int[][] mix = {{0, 0},
                {1, 1},
                {0, 0}
        };
        Info.printInfo(uniquePathsWithObstacles(mix));
    }
}
