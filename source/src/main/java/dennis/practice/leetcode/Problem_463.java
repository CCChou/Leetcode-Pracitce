package dennis.practice.leetcode;

public class Problem_463 {
    public int islandPerimeter(int[][] grid) {
        int landCount = 0;
        int connectCount = 0;
        for(int i=0;i< grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] == 1) {
                    landCount++;
                    if(i < grid.length - 1 && grid[i + 1][j] == 1) connectCount++;
                    if(j > 0 && grid[i][j - 1] == 1) connectCount++;
                }
            }
        }
        
        return landCount*4 - connectCount*2;
    }
}
