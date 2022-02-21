//203. Remove Linked List Elements


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
      ListNode cur= head;
     
      ListNode newList= new ListNode(-1);
      ListNode prev =newList;
      prev.next=head;
        
        while(cur!=null){
            if (cur.val==val){
             prev.next=cur.next;
             cur=cur.next;  
            }
            else{
                prev=cur;
                cur=cur.next;
                
            }
        }
         return newList.next;
    }
}
