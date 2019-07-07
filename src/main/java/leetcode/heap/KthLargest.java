package leetcode.heap;

import java.util.PriorityQueue;

public class KthLargest {

    private final PriorityQueue<Integer> priorityQueue;
    private int k;
    private final int[] nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
//        priorityQueue = new PriorityQueue<>(k, Collections.reverseOrder());
        priorityQueue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (priorityQueue.size() < k) {
            priorityQueue.add(val);
        } else if (priorityQueue.peek() < val){
            priorityQueue.poll();
            priorityQueue.add(val);
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
    }
}
