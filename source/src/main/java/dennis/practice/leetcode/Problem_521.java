package dennis.practice.leetcode;

public class Problem_521 {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)) return -1;
        
        return a.length() >= b.length() ? a.length() : b.length();
    }
}
