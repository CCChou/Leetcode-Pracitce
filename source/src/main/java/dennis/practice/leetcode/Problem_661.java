package dennis.practice.leetcode;

public class Problem_661 {
    public int[][] imageSmoother(int[][] M) {
        int[][] smootherM = new int[M.length][M[0].length];
        for(int i=0; i<M.length; i++) {
            for(int j=0; j<M[0].length; j++) {
                smootherM[i][j] = smoother(M, i, j);
            }
        }
        
        return smootherM;
    }
    
    private int smoother(int[][] arr, int x, int y) {
        int xStart = Math.max(x-1, 0);
        int xEnd = Math.min(x+1, arr.length-1);
        int yStart = Math.max(y-1, 0);
        int yEnd = Math.min(y+1, arr[0].length-1);
        
        int sum = 0;
        int count = 0;
        for(int i=xStart; i<=xEnd; i++) {
            for(int j=yStart; j<=yEnd; j++) {
                sum += arr[i][j];
                count++;
            }
        }
        
        return sum/count;
    }
}
