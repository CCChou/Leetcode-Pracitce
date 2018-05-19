package dennis.practice.leetcode;

public class Problem_762 {
    public int countPrimeSetBits(int L, int R) {
        int count = 0;
        for(int i=L; i<=R; i++) {
            if(isLegal(i)) count++;
        }
        
        return count;
    }
    
    private boolean isLegal(int number) {
        int count = 0;
        char[] binaryNums = Integer.toBinaryString(number).toCharArray();
        for(char binaryNum : binaryNums) {
            if(binaryNum == '1') count++;
        }
        
        if(count == 1) return false;
        for(int i=2; i<count; i++) {
            if(count%i == 0) return false;
        }
        
        return true;
    }
}
