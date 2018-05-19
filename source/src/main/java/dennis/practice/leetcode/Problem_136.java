package dennis.practice.leetcode;

public class Problem_136 {
    public int singleNumber(int[] nums) {
        // amazing
        // 5^5 = 0
        // so 5^5^6^6^7 = 7 
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        
        return result;
    }
}
