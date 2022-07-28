    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */

    /**
     *
     * @author Eduard
     */
    class Solution19 {



        public ListNode removeNthFromEnd(ListNode head, int n) {

               ListNode pt,walker;
               
               
               if(head.next == null){
                   return null;
               }

               walker = head;

               while(n - 1 > 0 ){
                   walker = walker.next;
                   if(walker.next == null){
                       return head.next;
                   }
                   n -= 1;
               }

               pt  = head;

               while(walker.next.next != null){
                   walker = walker.next;
                   pt = pt.next;
               }

               pt.next = (pt.next).next;


               return head;
        }
    }