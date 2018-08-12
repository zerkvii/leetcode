public class ClimbLadder {
    public static int climbStairs(int n) {
        if(n>2) {
            int[] dp = new int[n + 1];
            dp[1] = 1;
            dp[2] = 2;
            for (int i = 3; i <= n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n];
        }else {
            if(n==1)return 1;
            else return 2;
        }
    }

    public static void main(String... args) throws Exception {
       System.out.println(climbStairs(5));
    }
}
