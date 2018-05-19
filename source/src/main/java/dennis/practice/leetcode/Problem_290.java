package dennis.practice.leetcode;

public class Problem_290 {
    public boolean wordPattern(String pattern, String str) {
        char[] pat = pattern.toCharArray();
        String[] separ = str.split("\\s");

        if (pat.length != separ.length) {
            return false;
        }

        for (int i = 0; i < pat.length - 1; i++) {
            for (int j = 0; j < pat.length; j++) {
                if ((pat[i] == pat[j] && separ[i].equals(separ[j])) || (pat[i] != pat[j] && !separ[i].equals(separ[j]))) {

                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
