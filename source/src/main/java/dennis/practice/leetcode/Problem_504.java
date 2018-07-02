package dennis.practice.leetcode;

public class Problem_504 {
    public String convertToBase7(int num) {
        StringBuilder base7 = new StringBuilder();
        String sign = "";
        if (num == 0) {
            return "0";
        } else if (num < 0) {
            sign = "-";
            num = -num;
        }

        while (num != 0) {
            base7.insert(0, num % 7);
            num = num / 7;
        }

        return base7.insert(0, sign).toString();
    }
}
