package leetcode.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> parenthesesMap = new HashMap<Character, Character>();

        parenthesesMap.put(')', '(');
        parenthesesMap.put(']', '[');
        parenthesesMap.put('}', '{');

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++) {
            Character ch = s.charAt(i);
            if(parenthesesMap.containsKey(ch)) {
                if(!stack.isEmpty() && parenthesesMap.get(ch) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        boolean result = new ValidParentheses().isValid("{");
        System.out.println(result);
    }
}
