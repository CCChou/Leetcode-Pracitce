package dennis.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem_409 {
    public int longestPalindrome(String s) {
        int pairCount = 0;
        boolean hasOdd = false;
        Map<Character, Integer> map = new HashMap<>();
        char[] chs = s.toCharArray();
        for (char ch : chs) {
            if (map.get(ch) == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pairCount += entry.getValue() / 2;
            if (!hasOdd && entry.getValue() % 2 == 1) {
                hasOdd = true;
            }
        }

        return hasOdd ? pairCount * 2 + 1 : pairCount * 2;
    }
}
