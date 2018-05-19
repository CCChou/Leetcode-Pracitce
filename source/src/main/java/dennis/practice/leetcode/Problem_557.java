package dennis.practice.leetcode;

public class Problem_557 {
    public String reverseWords(String s) {
        StringBuilder reverse = new StringBuilder();
        char[] chWords;
        for(String word : s.split("\\s")) {
            chWords = word.toCharArray();
            for(int i=chWords.length-1; i>=0; i--) {
                reverse.append(chWords[i]);
            }
            reverse.append(' ');
        }
        
        reverse.deleteCharAt(s.length());
        return reverse.toString();
    }
}
