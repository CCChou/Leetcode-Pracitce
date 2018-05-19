package dennis.practice.leetcode;

import dennis.practice.leetcode.collection.ListNode;

public class Problem_234 {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        slow = reverse(slow);

        while (slow != null) {
            if (head.val != slow.val) {
                return false;
            }

            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
