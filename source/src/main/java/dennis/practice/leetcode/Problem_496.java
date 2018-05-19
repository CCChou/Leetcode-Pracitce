package dennis.practice.leetcode;

public class Problem_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] newArr = new int[nums1.length];
        
        for(int i=0; i<nums1.length; i++) {
            newArr[i] = getGreaterNum(nums2, nums1[i]);
        }
        
        return newArr;
    }
    
    private int getGreaterNum(int[] nums, int target) {
        boolean flag = false;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target && i != nums.length-1) {
                flag = true;
            }
            
            if(flag && nums[i] > target) {
                return nums[i];
            }
        }
        
        return -1;
    }
}
