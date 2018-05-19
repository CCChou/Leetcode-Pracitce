package dennis.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Problem_414 {
    public int thirdMax(int[] nums) {
        Set<Integer> setNum = new HashSet<Integer>();
        int[] max = new int[3];
        int min;

        for (int i = 0; i < nums.length; i++) {
            setNum.add(nums[i]);
        }
        if (setNum.size() < 3) {
            max[0] = nums[0];
            for (int num : setNum) {
                if (max[0] < num) {
                    max[0] = num;
                }
            }
            return max[0];
        } else {
            min = nums[0];
            for (int num : setNum) {
                if (min > num) {
                    min = num;
                }
            }
            for (int i = 0; i < max.length; i++) {
                max[i] = min;
            }
            for (int num : setNum) {
                if (max[0] < num) {
                    max[2] = max[1];
                    max[1] = max[0];
                    max[0] = num;
                }
            }
            return max[2];
        }
    }
}
