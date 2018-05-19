package dennis.practice.leetcode;

public class Problem_299 {
    public String getHint(String secret, String guess) {
        int A = 0;
        int B = 0;
        
        char[] seChar = secret.toCharArray();
        char[] guChar = guess.toCharArray();
        
        for(int i=0;i<seChar.length;i++) {
            if (seChar[i] == guChar[i]) {
                seChar[i] = 'A';
                guChar[i] = 'B';
                A++;
            }
        }
        
        for(int i=0;i<seChar.length;i++) {
            for(int j=0;j<guChar.length;j++) {
                if(guChar[i] == seChar[j]) {
                    seChar[j] = 'A';
                    B++;
                    break;
                }
            }
        }
        
        return new String(A+"A"+B+"B");
    }
}
