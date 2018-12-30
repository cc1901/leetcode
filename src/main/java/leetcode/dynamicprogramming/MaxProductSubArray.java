package leetcode.dynamicprogramming;

public class MaxProductSubArray {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int result = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];

        for(int i = 1; i< nums.length; i++) {
            int curMaxTemp = Math.max(nums[i],
                    Math.max(curMax * nums[i], curMin * nums[i]));
            curMin = Math.min(nums[i],
                    Math.min(curMax * nums[i], curMin * nums[i]));
            curMax = curMaxTemp;
            result = Math.max(curMax, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int maxProduct = new MaxProductSubArray().maxProduct(new int[]{-4, -3, -2});
        System.out.println(maxProduct);
    }
}
