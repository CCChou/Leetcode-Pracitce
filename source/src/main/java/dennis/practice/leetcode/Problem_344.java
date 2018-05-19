package dennis.practice.leetcode;

import java.util.Arrays;

public class Problem_344 {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        char[] temp = Arrays.copyOf(ch, ch.length);
        for (int i = 0; i < ch.length; i++) {

            ch[i] = temp[temp.length - 1 - i];
        }
        String str = new String(ch);
        return str;

    }
}
