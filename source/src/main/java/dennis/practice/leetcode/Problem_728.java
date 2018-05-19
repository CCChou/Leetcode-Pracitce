package dennis.practice.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Problem_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNums = new LinkedList<>();
        int temp;
        for(int i=left; i<=right; i++) {
            temp = i;
            while(temp > 0) {
                if(temp % 10 == 0 || i % (temp % 10) != 0) break;
                temp /= 10;
            }
            
            if(temp == 0) selfDividingNums.add(i);
        }
        
        return selfDividingNums;
    }
}
