package dennis.practice.leetcode;

public class Problem_319 {
    public int bulbSwitch(int n) {
        // 因數有幾個 偶數個會是 off 奇數個會是 on
        return (int) Math.sqrt(n);
    }
}
