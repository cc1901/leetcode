package leetcode.array;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Integer majority = null;
        int counter = 1;

        for (int num: nums) {
            if (counter == 0) {
                majority = num;
            }
            counter += (num == majority) ? 1 : -1;
        }
        return majority;
    }

    public static void main(String[] args) {

    }
}
