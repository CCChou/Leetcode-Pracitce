package dennis.practice.leetcode;

// TODO
public class Problem_300 {
    public int lengthOfLIS(int[] nums) {
        int min = nums[0];
        int previous = min;
        int count = 0;
        int maxCount = count;
        for(int num : nums) {
            if(num < min) {
                min = num;
                maxCount = maxCount < count ? count : maxCount;
                count = 0;
                previous = num;
            }
            
            if(previous < num) {
                count++;
                previous = num;
            }
        }
        
        return maxCount;
    }
    
    public static void main(String[] args) {
        // [10, 9, 2, 5, 3, 7, 101, 18]
        // [2, 3, 7, 101]
        // answer : 4
        
        Problem_300 test = new Problem_300();
        System.out.println(test.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
