package dennis.practice.leetcode;

public class Problem_867 {
    // TODO without the comment code the result would be time limited...
    public int primePalindrome(int N) {
        if (N == 1 || N == 2) {
            return 2;
        }

        if (N % 2 == 0) {
            N++;
        }

        while (true) {
            if (isPalindrome(N) && isPrime(N)) {
                return N;
            }
            N += 2;
            // if (10_000_000 < N && N < 100_000_000) {
            //     N = 100_000_001;
            // }
        }
    }

    private boolean isPrime(int num) {
        int square = (int) Math.sqrt(num) + 1;
        for (int i = 3; i < square; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isPalindrome(int num) {
        char[] chs = String.valueOf(num).toCharArray();
        for (int i = 0, j = chs.length - 1; i < j; i++, j--) {
            if (chs[i] != chs[j]) {
                return false;
            }
        }
        return true;
    }

    // private boolean isPalindrome(int n) {
    //     int n1 = 0, i = n;
    //     while (i > n1) {
    //         n1 = n1 * 10 + (i % 10);
    //         i /= 10;
    //     }
    //     return n1 == i || i == n1 / 10;
    // }
}
