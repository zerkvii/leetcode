public class maxSerial {
    public static int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        for (int i = 1; i < len; i++) {
            dp[i] = (nums[i] > dp[i - 1] + nums[i]) ? nums[i] : (dp[i - 1] + nums[i]);
        }
        int k = dp[0];
        for (int i = 0; i < len; i++) {
            if (k < dp[i]) k = dp[i];
        }
        return k;
    }
//最大子序列状态方程为dp[i]=max(dp[i-1]+nums[i],nums[i])这个是关键,变体可以是循环数列
    public static void main(String... args) throws Exception {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
