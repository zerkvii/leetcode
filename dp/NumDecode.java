public class NumDecode {
    public static int numDecodings(String s) {
        int len = s.length();
        char[] array = s.toCharArray();
        if (len == 0) return 0;
        int[] dp = new int[len];
        if (array[0] == '0') dp[0] = 0;
        else
            dp[0] = 1;
        if (len == 1) return dp[0];

        int numeric = 10 * (array[0] - '0') + array[1] - '0';
        if (array[0] == '0' || (numeric > 26 && array[1] == '0')) dp[1] = 0;
        else if (numeric <= 26 && array[1] != '0') dp[1] = 2;
        else dp[1] = 1;

        for (int i = 2; i < len; ++i) {
            int num = (array[i - 1] - '0') * 10 + array[i] - '0';

            if (num <= 26 && array[i] != '0') {
                if (array[i - 1] != '0') dp[i] = dp[i - 1] + dp[i - 2];
                else dp[i] = dp[i - 1];
            } else if (num > 26 && array[i] != '0') {

                dp[i] = dp[i - 1];
            } else if (num < 26 && array[i] == '0') {
                if (array[i - 1] != '0') dp[i] = dp[i - 2];
                else dp[i] = 0;
            } else dp[i] = 0;
        }
        return dp[len - 1];
    }

    public static void main(String... args) throws Exception {
        String s = "100";
        Info.printInfo(numDecodings(s));
    }
}
