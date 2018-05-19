package dennis.practice.leetcode;

public class Problem_238 {
    public int[] productExceptSelf(int[] nums) {
        int temp = 1;
        int count = 0;
        int length = nums.length;
        
        for (int i=0;i<length;i++) {
            if (nums[i] == 0) {
                count++;
                continue;
            }
            temp *= nums[i];
        }
        
        if (count > 1) {
            for (int i=0;i<length;i++) {
                nums[i] = 0;
            }
        } else if (count == 1) {
            for (int i=0;i<length;i++) {
                if (nums[i] == 0) {
                    nums[i] = temp;
                } else {
                    nums[i] = 0;
                }
            }
        } else {
            for (int i=0;i<length;i++) {
                nums[i] = temp/nums[i];
            }
        }
        
        return nums;
    }
}
