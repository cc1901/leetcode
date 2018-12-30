package leetcode.bit;

public class BasicOperation {
    public static void main(String[] args) {
        int a = 99;
        int b = 95;
        int c = a ^ b;
        a = a ^ c;
        b = b ^ c;
        System.out.println(a);
        System.out.println(b);

        boolean x1 = (3 & 1) == 1;
        boolean x2 = (2 & 1) == 1;
        System.out.println(x1);
        System.out.println(x2);

        int x3 = 0b111110000;
        System.out.println(Integer.toBinaryString(x3 & (x3 -1)));

        int x4 = 0b111110000;
        System.out.println(Integer.toBinaryString(x4 & -x4));
    }
}
