//206. Reverse Linked List


class Solution {
    public ListNode reverseList(ListNode head) {
         if(head==null){
            return head;
        }
        ListNode temp = head;
        ListNode prevPtr = head;
        head=head.next;
        prevPtr.next=null;
        while(head!=null){
            temp=head;
            head=head.next;
            temp.next=prevPtr;
            prevPtr=temp;
        }
        return prevPtr;
    
    
    }
}
