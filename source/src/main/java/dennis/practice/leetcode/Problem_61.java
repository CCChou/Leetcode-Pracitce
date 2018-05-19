package dennis.practice.leetcode;

import dennis.practice.leetcode.collection.ListNode;

public class Problem_61 {
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        int target;
        ListNode ptr = head;
        ListNode tail = null;
        
        if (head == null || k == 0) {
            return head;
        }
        
        while(ptr != null) {
            size++;
            tail = ptr;
            ptr = ptr.next;
        }
        
        target = size - (k % size);
        if (target <= 0) {
            return head;
        }
        
        ptr = head;
        while(target > 1) {
            ptr = ptr.next;
            target--;
        }
        
        tail.next = head;
        head = ptr.next;
        ptr.next = null;
        
        return head;
    }
}
