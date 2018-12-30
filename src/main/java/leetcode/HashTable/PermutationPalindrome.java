package leetcode.HashTable;

public class PermutationPalindrome {
    public boolean canPermutePalindrome(String s) {
        if(s == null) return true;
        int[] counter = new int[256];
        for(int i = 0; i< s.length(); i++) {
            char cur = s.charAt(i);
            counter[cur-0] ++;
        }
        int odd = 0;
        for(int i =0; i< counter.length; i++) {
            if(counter[i] %2 != 0) {
                odd++;
            }
        }
        return odd <= 1;
    }

    public static void main(String[] args) {
        System.out.println(new PermutationPalindrome().canPermutePalindrome("AaBb//a"));
    }
}
