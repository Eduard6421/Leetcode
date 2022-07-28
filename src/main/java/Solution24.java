/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
class Solution24 {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode fakeHead = new ListNode(0);
        
        fakeHead.next = head;
        
        ListNode left,middle,right;
        
        left = fakeHead;
        middle = head;
        right = head.next;
        
        while(right != null) {
            middle.next = right.next;
            right.next = middle;
            left.next = right;
            
            if(middle.next != null && middle.next.next != null){
                left = middle;
                middle = middle.next;
                right = middle.next;
            }
            else {
                right = null;
            }

        }
        
        return fakeHead.next;
    }
}
