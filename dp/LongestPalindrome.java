public class LongestPalindrome {

//    public static String longestPalindrome(String s) {
//        if(s.length()==0)return "";
//        int len = s.length();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < len - 1; i++) {
//            sb.append(s.charAt(i));
//            sb.append('#');
//        }
//        sb.append(s.charAt(len - 1));
//        String maxSubstr = "";
//        int max = 0;
//        String tar = sb.toString();
//        int length = tar.length();
////
////        Info.printInfo(tar);
////        Info.printInfo(length);
//        for (int i = 0; i < length; ++i) {
//            int temp = maxlen(tar, i, i > (length - i - 1) ? length - i - 1 : i);
//            String tempstr=tar.substring(i - temp / 2, i + temp / 2 + 1).replace("#","");
////            Info.printInfo(tempstr.length());
//            if (max<tempstr.length()) {
//                max = tempstr.length();
//                maxSubstr=tempstr;
//            }
//        }
//
//        return maxSubstr;
//    }
//
//    public static int maxlen(String tar, int centre, int threshold) {
//        int j = 0;
//        while (j <= threshold) {
//            if (tar.charAt(j + centre) == tar.charAt(centre - j)) {
//                j++;
//            } else break;
//        }
//        return 2 * j - 1;
//    }
//

//    public static String longestPalindrome(String s){
//        if (s == null || s.length() <= 1)
//            return s;
//        int n = s.length();
//        char[] cs = s.toCharArray();
//        int max = 1;
//        int maxIndex = 0;
//        boolean dp[][] = new boolean[n][n];
//        // 初始化一个字母
//        for (int i = 0; i < n; i++) {
//            dp[i][i] = true;
//        }
//        // 初始化两个相同的字母"aa"
//        for (int i = 0; i < n - 1; i++)
//            if (cs[i] == cs[i + 1]) {
//                dp[i][i + 1] = true;
//                // 返回最后一为2的子串
//                max = 2;
//                maxIndex = i;
//                Info.printInfo(i);
//            }
//        // 从长度3开始操作, (aba)ba, a(bab)a, ab(aba)
//        for (int len = 3; len <= n; len++)
//            for (int i = 0; i < n - len + 1; i++) {
//                // j为从i~i + len - 1下标，长度为len
//                int j = i + len - 1;
//                // 字符相同，并且内部长度是回文
//                if (cs[i] == cs[j] && dp[i + 1][j - 1]) {
//                    max = len;
//                    // 因为长度递增，如果之后的的能进入这里都是比之前长的，
//                    // 所以不需要判断大小
//                    maxIndex = i;
//                    dp[i][j] = true;
//                }
//            }
//        return s.substring(maxIndex, maxIndex + max);
//
//
//    }

    public static String longestPalindrome(String s){
        if(s==null||s.length()<=1)return s;
        char[] array=s.toCharArray();
        int length=s.length();
        int[][] dp=new int[length][length];
        for(int i=0;i<length;++i)dp[i][i]=1;
        int maxIndex=0;
        int max=1;
        for(int i=0;i<length-1;++i){
            if(array[i]==array[i+1]){
                dp[i][i+1]=1;
                max=2;
                maxIndex=i;
            }
        }
        for(int size=3;size<=length;++size){
            for(int i=0;i<length-size+1;++i){
                int j=i+size-1;
                if(array[i]==array[j]&&dp[i+1][j-1]==1)
                {
                    maxIndex=i;
                    max=size;
                    dp[i][j]=1;
                }
            }
        }
        return s.substring(maxIndex,maxIndex+max);
    }
    public static void main(String... args) throws Exception {

        String s = "";
        System.out.println(longestPalindrome(s));

    }
}
