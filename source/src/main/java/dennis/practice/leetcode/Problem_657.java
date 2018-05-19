package dennis.practice.leetcode;

public class Problem_657 {
    public boolean judgeCircle(String moves) {
        int upDownCount = 0;
        int rightLeftCount = 0;
        
        for(char move : moves.toCharArray()) {
            switch (move) {
                case 'U': upDownCount++; break;
                case 'D': upDownCount--; break;
                case 'R': rightLeftCount++; break;
                case 'L': rightLeftCount--; break;
            }
        }
        
        return upDownCount == 0 && rightLeftCount == 0;
    }
}
