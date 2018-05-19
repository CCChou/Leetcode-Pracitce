package dennis.practice.leetcode;

public class Problem_520 {
    public boolean detectCapitalUse(String word) {
        char[] wordElements = word.toCharArray();
        int wordLength = word.length();
        
        if(wordLength == 1) {
            return true;
        }
        
        if(isLower(wordElements[0])) {
            for(int i=1; i<wordLength; i++) {
                if(isUpper(wordElements[i])) return false;
            }
        } else if (isUpper(wordElements[0]) && isUpper(wordElements[1])) {
            for(int i=2; i<wordLength; i++) {
                if(isLower(wordElements[i])) return false;
            }
        } else if (isUpper(wordElements[0]) && isLower(wordElements[1])) {
            for(int i=2; i<wordLength; i++) {
                if(isUpper(wordElements[i])) return false;
            }
        }
        
        return true;
    }
    
    private boolean isUpper(char element) {
        return element >=  65 && element <= 90;
    }
    
    private boolean isLower(char element) {
        return element >= 97 && element <= 122;
    }
}
