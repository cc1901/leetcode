package leetcode.bit;

public class NumberOf1Bits {
    public int hammingWeight1(int n) {
        int mask = 1;
        int count = 0;
        for(int i=0; i<32; i++) {
            if((n & mask) != 0) count++;
            mask = mask << 1;
        }
        return count;
    }

    public int hammingWeight2(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int input = 0b11111111111111111111111111111101;
        System.out.println(new NumberOf1Bits().hammingWeight1(input));
        System.out.println(new NumberOf1Bits().hammingWeight2(input));
    }
}
