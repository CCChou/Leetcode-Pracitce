package dennis.practice.leetcode;

public class Problem_258 {
    public int addDigits(int num) {
        if (num == 0) return 0;

        return num % 9 == 0 ? 9 : num % 9;
    }
}
