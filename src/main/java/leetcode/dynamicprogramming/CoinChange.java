package leetcode.dynamicprogramming;

public class CoinChange {
    public CoinChange() {
    }

    public int coinChange(int[] coins, int amount) {
        int[] res = new int[amount + 1];
        for(int i = 0; i<=amount; i++) {
            res[i] = amount + 1;
        }
        res[0] = 0;
        for(int i = 0; i<= amount; i++) {
            for(int j = 0; j< coins.length; j++) {
                if(i >= coins[j]) {
                    res[i] = Math.min(res[i- coins[j]] + 1, res[i]);
                }
            }
        }
        return res[amount] > amount ? -1: res[amount];
    }

    public static void main(String[] args) {
        int res = new CoinChange().coinChange(new int[]{2, 3, 5}, 11);
        System.out.println(res);
    }
}
