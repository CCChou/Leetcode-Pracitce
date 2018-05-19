package dennis.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_412 {
    public List<String> fizzBuzz(int n) {
        String[] nums = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                nums[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                nums[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                nums[i - 1] = "Buzz";
            } else {
                nums[i - 1] = String.valueOf(i);
            }
        }
        return new ArrayList<String>(Arrays.asList(nums));
    }
}
