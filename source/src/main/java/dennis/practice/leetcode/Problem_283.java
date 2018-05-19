package dennis.practice.leetcode;

public class Problem_283 {
    public void moveZeroes(int[] nums) {
        int countZero = 0, length = nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==0){
                countZero++;
            }
            else{
                nums[i-countZero] = nums[i];
            }
        }
        while(countZero!=0){
            nums[--length]=0;
            countZero--;
        }
    }
}
