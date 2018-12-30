package leetcode.string;

public class ReverseString {
    public static void main(String[] args) {
        String result = new ReverseString().reverseString1("hello");
        System.out.println(result);
    }

    public String reverseString(String s) {
        int l = 0;
        int r = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (l < r) {
            char tmp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, tmp);
            l++;
            r--;
        }
        return sb.toString();
    }

    public String reverseString1(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] chars = s.toCharArray();
        while (l < r) {
            char tmp = chars[l];
            chars[l] = chars[r];
            chars[r] = tmp;
            l++;
            r--;
        }
        return String.valueOf(chars);
    }

}
