package leetcode.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;
    private int size = 0;
    /** initialize your data structure here. */
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if (size % 2 == 1) {
            if (!maxHeap.isEmpty() && maxHeap.peek() > num) {
                minHeap.add(maxHeap.poll());
                maxHeap.add(num);
            } else {
                minHeap.add(num);
            }
        } else {
            if (!minHeap.isEmpty() && minHeap.peek() < num) {
                maxHeap.add(minHeap.poll());
                minHeap.add(num);
            } else {
                maxHeap.add(num);
            }
        }
        size++;
    }

    public Double findMedian() {
        if (size == 0) {
            return null;
        }
        if (size % 2 == 1) {
            return (double)maxHeap.peek();
        } else {
            return ((double)minHeap.peek() + (double)maxHeap.peek()) / 2;
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(-1);
        medianFinder.addNum(-2);
        medianFinder.addNum(-3);
        medianFinder.addNum(-4);
        medianFinder.addNum(-5);

        System.out.println(medianFinder.findMedian());
    }
}
