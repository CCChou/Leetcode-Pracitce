package dennis.practice.leetcode;

public class Promble_461 {
    public int hammingDistance(int x, int y) {
        int xorNum = x ^ y;
        int count = 0;
        while(xorNum / 2 != 0) {
            if(xorNum % 2 == 1) count++;
            xorNum /= 2;
        }
        return xorNum % 2 == 0 ? count : ++count;
    }
}
