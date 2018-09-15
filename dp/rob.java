public class rob {

    public static int rob(int[] nums) {

        int len = nums.length;
        if (len == 0) return 0;
        if (len == 1) return nums[0];
        if (len == 2) return nums[1] > nums[0] ? nums[1] : nums[0];

        int[] dp=new int[len];
        dp[0]=nums[0];
        dp[1]=nums[0]>nums[1]?nums[0]:nums[1];

        for (int i = 2; i < len; i++) {
            dp[i]=dp[i-1]>(dp[i-2]+nums[i])?dp[i-1]:(dp[i-2]+nums[i]);
        }
        return dp[len-1];
    }

        public static void main (String...args) throws Exception {
            int[] nums = {2, 7, 9, 3, 1};
            System.out.println(rob(nums));
        }
    }
