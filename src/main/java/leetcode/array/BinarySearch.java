package leetcode.array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ints = {-9, 14, 37, 102};
        System.out.println(exists(ints, 102));
        System.out.println(exists(ints, 36));
    }
    static boolean exists(int[] ints, int k) {
        if (ints == null) return false;
        int pos = Arrays.binarySearch(ints, k);
        return pos < 0 ? false : true;
    }


}
