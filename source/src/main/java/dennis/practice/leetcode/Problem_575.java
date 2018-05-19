package dennis.practice.leetcode;

import java.util.Arrays;

public class Problem_575 {
    public int distributeCandies(int[] candies) {
        Arrays.sort(candies);
        
        int count = 1;
        int temp = candies[0];
        for(int candy : candies) {
            if(candy != temp) {
                count++;
                temp = candy;
            }
        }
        
        return count >= (candies.length/2) ? candies.length/2 : count;
    }
}
