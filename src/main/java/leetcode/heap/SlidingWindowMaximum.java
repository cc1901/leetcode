package leetcode.heap;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];

        int[] res = new int[nums.length - k +1];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(k, Comparator.reverseOrder());
        for(int i=0; i<nums.length; i++) {
            if(i >= k){
                priorityQueue.remove(nums[i-k]);
                priorityQueue.add(nums[i]);
                res[i-k+1] = priorityQueue.peek();
            } else if(i == k-1) {
                priorityQueue.add(nums[i]);
                res[0] = priorityQueue.peek();
            } else {
                priorityQueue.add(nums[i]);
            }
        }
        return res;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];

        LinkedList<Integer> window = new LinkedList<Integer>();
        int[] result = new int[nums.length - k + 1];
        for(int i =0; i< nums.length; i++) {
            if(i>=k && window.getFirst() < i-k+1) {
                window.pop();
            }
            while(!window.isEmpty() && nums[window.getLast()] < nums[i]){
                window.removeLast();
            }
            window.add(i);
            if(i >= k-1){
                result[i-k+1] = nums[window.getFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = new SlidingWindowMaximum().maxSlidingWindow1(new int[]{1, 3, 1, 2, 0, 5}, 3);
        for (int i : x) {
            System.out.println(i);
        }
    }
}
