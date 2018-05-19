package dennis.practice.leetcode;

import java.util.List;

import dennis.practice.leetcode.collection.Employee;

public class Problem_690 {
    public int getImportance(List<Employee> employees, int id) {
        int value = 0;
        for(Employee employee : employees) {
            if(employee.id != id) continue;
            if(employee.subordinates.isEmpty()) {
                return employee.importance;                
            } else {
                value +=  employee.importance;
                for(int subId : employee.subordinates) {
                    value += getImportance(employees, subId);
                }
            }
        }
        
        return value;
    }
}
