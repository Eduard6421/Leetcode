/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */
public class Solution21 {
    
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
         ListNode head;
         ListNode walker;
         
         if(list1 == null){
             return list2;
         }
         
         if(list2 == null){
             return list1;
         }
         
         if(list1.val < list2.val){
             head = walker = list1;
             list1 = list1.next;
         }
         else{
             head = walker = list2;
             list2 = list2.next;
         }
         
         while(list1 != null && list2 != null){
             if(list1.val < list2.val){
                 head.next = list1;
                 list1 = list1.next;
                 head = head.next;
             }
             else{
                 head.next = list2;
                 list2 = list2.next;
                 head = head.next;
             }
         }
         
        while(list1 != null){
            head.next = list1;
            list1 = list1.next;
            head = head.next;
        }
        
        while(list2 != null){
            head.next = list2;
            list2 = list2.next;
            head = head.next;
        }
         
        return walker;
            
        }
    
}
