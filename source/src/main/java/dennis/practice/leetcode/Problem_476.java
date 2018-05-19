package dennis.practice.leetcode;

public class Problem_476 {
    public int findComplement(int num) {
        int n = 0;
        while(n < num) {
            n = (n<<1) | 1;
        }
        return n - num;
    }
}
