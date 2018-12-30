package leetcode.recursion;

public class PowN {
    public double myPow(double x, int n) {
        long N = n;
        return pow(x, N);
    }

    private double pow(double x, long N) {
        if(N == 0) return 1;
        if(N < 0) return 1/pow(x, -N);
        if(N%2 != 0) return x * pow(x, N-1);
        return pow(x*x, N/2);
    }

    public static void main(String[] args) {
        new PowN().myPow(1.00000, -2147483648);
    }
}
