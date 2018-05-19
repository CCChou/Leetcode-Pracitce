package dennis.practice.leetcode;

import dennis.practice.leetcode.collection.ListNode;

public class Problem_203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode p = preHead;
        while (p.next != null) {
            if (p.next.val == val)
                p.next = p.next.next;
            else
                p = p.next;
        }
        return preHead.next;
    }
}
