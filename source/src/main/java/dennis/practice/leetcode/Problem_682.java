package dennis.practice.leetcode;

public class Problem_682 {
    public int calPoints(String[] ops) {
        int[] temp = new int[ops.length];
        int index = 0;
        int sum = 0;
        for(int i=0;i<ops.length;i++) {
            switch (ops[i]){
            case "C": index--; 
                      break;
            case "D": temp[index] = temp[index-1] * 2;
                      index++; 
                      break;
            case "+": temp[index] = temp[index-1] + temp[index-2];
                      index++;
                      break;
            default:  temp[index] = Integer.parseInt(ops[i]);
                      index++;
            }
        }
        
        for(int i=0;i<index;i++) {
            sum += temp[i];
        }
        
        return sum;
    }
}
