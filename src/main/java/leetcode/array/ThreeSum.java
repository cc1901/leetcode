package leetcode.array;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
//        List<List<Integer>> results = new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> results = new ThreeSum().threeSum(new int[]{0, 0, 0, 0});
        System.out.println(results);
        int[] test = new int[] {-4, -1, -1, 0, 1, 2};
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null) {
            return results;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length -2; i++) {
            if (i>0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i+1;
            int r = nums.length -1;
            while (l<r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum < 0) {
                    l++;
                } else if(sum > 0) {
                    r--;
                } else {
                    results.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l<r && nums[l] == nums[l + 1]) {
                        l++;
                    }
                    while (l<r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    r--;
                    l++;
                }
            }
        }
        return results;
    }

}
