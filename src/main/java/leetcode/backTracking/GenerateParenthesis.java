package leetcode.backTracking;

import java.util.*;

public class GenerateParenthesis {

    private void doGenerate(List<String> results, StringBuilder sb, int left, int right) {
        if(left == 0 && right == 0) {
            results.add(sb.toString());
            return;
        }
        if(left > 0) {
            synchronized (GenerateParenthesis.class){
                doGenerate(results, sb.append("("), left -1, right );
            }
        }


    }

    private static int counter = 0;
    public  static int increment() {
        synchronized (GenerateParenthesis.class) {
            counter++;
        }
        return counter;
    }
    public static void main(String[] args) {
        HashMap<String, Character> map = new HashMap<>();
        for (int i = 0; i < 25; i++) {
            Character character = (char)('A' + i);
            map.put("", character);
        }

        int results = Arrays.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 10);
    }

}
