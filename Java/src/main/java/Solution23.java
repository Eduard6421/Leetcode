
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduard
 */


public class Solution23 {
    
    /*
    public class CompClass {
    
        public static int compare(Pair<Integer,Integer> a, Pair<Integer,Integer> b){
            return a.first - b.first;
        }
    
    }
*/
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
    
    
    public ListNode mergeKLists(ListNode[] lists, int numLists){
        
        if(numLists == 0){
            return null;
        }
        
        if(numLists == 1){
            return lists[0];
        }
        
        int totalCount = 0;
        
        for(int i = 0 ; i < numLists/ 2; ++i){
            ListNode newNode = this.mergeTwoLists(lists[i*2], lists[i*2+1]);
            lists[totalCount++] = newNode;
        }
        
        if(numLists % 2 == 1){
            lists[totalCount++] = lists[numLists-1];
        }
        
        return mergeKLists(lists, totalCount);
        
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode result = this.mergeKLists(lists, lists.length);
        
        return result;
        
    }

}
