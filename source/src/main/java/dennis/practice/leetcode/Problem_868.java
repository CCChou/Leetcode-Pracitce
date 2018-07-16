package dennis.practice.leetcode;

public class Problem_868 {
    public int[][] transpose(int[][] A) {
        int[][] transposeA = new int[A[0].length][A.length];
        for(int i = 0; i<A.length; i++) {
            for(int j = 0; j<A[0].length; j++) {
                transposeA[j][i] = A[i][j];
            }   
        }
        
        return transposeA;
    }
}
