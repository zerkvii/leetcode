public class BuyStock {
    //
    public static int maxProfit(int[] prices) {
        int len=prices.length;
        if(len==0)return 0;
        else {
            int min = prices[0];
            int maxp = 0;
            for (int price : prices) {
                if (price < min) min = price;
                if (maxp < price - min) maxp = price - min;
            }
            return maxp;
        }
    }

    public static void main(String... args) throws Exception {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));

    }
}
