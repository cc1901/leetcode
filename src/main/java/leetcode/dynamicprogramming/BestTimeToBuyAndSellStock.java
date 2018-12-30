package leetcode.dynamicprogramming;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int K, int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1) return 0;
        int n = prices.length;
        int[][][] mp = new int[n][K+1][2];
        mp[0][0][0] = 0;
        mp[0][1][1] = -prices[0];

        for(int i =1 ; i< n; i++) {
            for(int k=1; k<= K; k++ ) {
                mp[i][k][0] = Math.max(mp[i-1][k][0], mp[i-1][k-1][1] + prices[i]);
                mp[i][k][1] = Math.max(mp[i-1][k][1], mp[i-1][k-1][0] - prices[i]);
            }
        }

        int result = 0;
        for(int k=0; k<K; k++) {
            result = Math.max(result, mp[n-1][k][0]);
        }
        return result;
    }

    public static void main(String[] args) {
        int result = new BestTimeToBuyAndSellStock().maxProfit(2, new int[]{2, 4, 1});
        System.out.println(result);
    }
}
