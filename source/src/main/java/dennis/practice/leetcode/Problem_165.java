package dennis.practice.leetcode;

public class Problem_165 {
    public int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int length1 = ver1.length;
        int length2 = ver2.length;
        int maxLen = Math.max(length1, length2);

        for (int i = 0; i < maxLen; i++) {
            int temp1 = 0, temp2 = 0;
            if (i < length1) {
                temp1 = Integer.parseInt(ver1[i]);
            }
            if (i < length2) {
                temp2 = Integer.parseInt(ver2[i]);
            }
            if (temp1 > temp2) {
                return 1;
            } else if (temp1 < temp2) {
                return -1;
            }
        }
        return 0;
    }
}
