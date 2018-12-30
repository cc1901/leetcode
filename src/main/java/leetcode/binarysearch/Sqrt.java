package leetcode.binarysearch;

import java.util.Arrays;

public class Sqrt {
    public double mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        return sqrt(x, 1e-9);
    }

    private double sqrt(int x, double tolerance) {
        double l = 0;
        double r = x;
        double result = 0.0;
        while (l <= r) {
            double mid = (l + r)/2;
            if (Math.abs(mid - x / mid) <= tolerance) {
                result = mid;
            } else if (mid - x / mid > 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
                result = mid;
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
