package leetcode.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class ClimbStairs {
    public static void main(String[] args) {
        new ClimbStairs().solution(10);
    }

    public void solution(int n) {
        climbStairs("", n);
    }

    public void climbStairs(String results, int n) {
        if (n == 0 ) {
            System.out.println(results);
            return;
        }
        climbStairs(results + " 1", n-1);
        if (n >= 2) {
            climbStairs(results + " 2", n-2);
        }
    }
}
