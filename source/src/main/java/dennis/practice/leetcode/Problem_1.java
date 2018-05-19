package dennis.practice.leetcode;

public class Problem_1 {
    // TODO Discuss 中有用 HashMap 的方法，可以將時間減少到 O(n)
    public int[] twoSum(int[] nums, int target) {
        int temp = 0;
        for(int i=0; i<nums.length; i++) {
            temp = target - nums[i];
            for(int j=i+1; j<nums.length; j++) {
                if(temp == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[]{0,0};
    }
}
