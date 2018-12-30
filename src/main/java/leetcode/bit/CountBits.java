package leetcode.bit;

public class CountBits {
    public int[] countBits(int num) {
        int[] counts = new int[num +1];
        for(int i=1; i< num +1; i++) {
            counts[i] = counts[i&(i-1)] + 1;
        }
        return counts;
    }
}
