package dennis.practice.leetcode;

public class Problem_693 {
    public boolean hasAlternatingBits(int n) {
        char[] binaryCh = Integer.toBinaryString(n).toCharArray();
        
        for(int i=0; i<binaryCh.length-1; i++) {
            if(binaryCh[i] == binaryCh[i+1]) return false;
        }
        
        return true;
    }
}
