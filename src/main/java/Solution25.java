/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
class Solution25 {

    public ListNode reverseList(ListNode head) {

        ListNode left = null;
        ListNode mid = head;
        ListNode right = head.next;

        while (mid != null) {
            mid.next = left;
            left = mid;
            mid = right;
            if (right != null) {
                right = right.next;
            }
        }

        return left;

    }


    public ListNode reverseKGroup(ListNode head, int k) {

        if (k == 1 || head == null || head.next == null) {
            return head;
        }

        ListNode end = head;

        for (int i = 1; end != null && i % k != 0; ++i) {
            end = end.next;
        }

        if (end == null) {
            return head;
        } else {
            
            ListNode firstNodeAfter = end.next;
            ListNode left = null;
            ListNode mid = head;
            ListNode right = head.next;
            
            
            while (mid != firstNodeAfter) {
                mid.next = left;
                left = mid;
                mid = right;
                if (right != firstNodeAfter) {
                    right = right.next;
                }
            }
            
            head.next = reverseKGroup(firstNodeAfter, k);
            
            return end;

        }
    }
}
