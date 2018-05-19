package dennis.practice.leetcode;

public class Problem_566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int numberCount = nums[0].length*nums.length;
        if(numberCount != r*c) return nums;
        
        int index = 0;
        int[] temp = new int[numberCount];
        for(int i=0;i<nums.length;i++) {
            for(int j=0;j<nums[0].length;j++) {
                temp[index++] = nums[i][j];
            }
        }
        
        index = 0;
        int[][] mixMatrix = new int[r][c];
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                mixMatrix[i][j] = temp[index++];
            }
        }
        
        return mixMatrix;
    }
}
