package leetcode.HashTable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> counter = new HashMap<Character, Integer>();

        for(int i=0;i<s.length(); i++) {
            if(s.charAt(i) == t.charAt(i)) continue;
            Integer count1 = counter.computeIfAbsent(s.charAt(i), (k)->0);
            Integer count2 = counter.computeIfAbsent(t.charAt(i), (k)->0);
            counter.put(s.charAt(i), count1 + 1);
            counter.put(t.charAt(i), count2 - 1);
        }
        for(Integer val: counter.values()) {
            if(!val.equals(0)) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] counter = new int[26];
        for(int i= 0; i<s.length();i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<counter.length; i++) {
            if(counter[i] != 0) return false;
        }
        return true;
    }

    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
