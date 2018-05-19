package dennis.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem_539 {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> minuteList = new ArrayList<>();
        for(String time : timePoints) {
            minuteList.add(parseTime(time));
        }
        
        Collections.sort(minuteList);
        
        int min = 24 * 60;
        int temp;
        for(int i=0; i<minuteList.size(); i++) {
            if(i == minuteList.size()-1) {
                temp = minuteList.get(0) + 1440 - minuteList.get(minuteList.size()-1);
            } else {
                temp = minuteList.get(i + 1) - minuteList.get(i);
            }
            min = temp < min ? temp : min;
        }   
        
        return min;
    }
    
    private int parseTime(String time) {
        int minute = Integer.parseInt(time.substring(time.indexOf(":") + 1, time.length()));
        int hour = Integer.parseInt(time.substring(0, time.indexOf(":")));
        hour = hour == 0 ? 24 : hour;
        
        return hour * 60 + minute;
    }
    
    public static void main(String[] args) {
        Problem_539 test = new Problem_539();
        System.out.println(test.findMinDifference(Arrays.asList("12:12", "00:13")));
    }
}
