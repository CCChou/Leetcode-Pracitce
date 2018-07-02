package dennis.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Problem_599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int sum = 0;
        Map<Integer, StringBuilder> map = new HashMap<>();
        String restaurant;
        
        for(int i=0; i<list1.length; i++) {
            restaurant = list1[i];
            for(int j=0; j<list2.length; j++) {
                if(restaurant.equals(list2[j])) {
                    sum = i + j;
                    if(map.containsKey(sum)) {
                        map.get(sum).append(",").append(restaurant);
                    } else {
                        map.put(sum, new StringBuilder(restaurant));
                    }
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int num : map.keySet()) {
            min = Math.min(num, min);
        }
        
        return map.get(min).toString().split(",");
    }
}
