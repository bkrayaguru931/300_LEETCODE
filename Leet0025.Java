//25. Reverse Nodes in k-Group




class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode cur = head;
        ListNode pre = null;
        ListNode nex = null;
        
        ListNode temp = head;
        int len=0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        
        int cou=0;
        while(cou < k && cur!=null){
            nex = cur.next;
            cur.next = pre;
            
            pre = cur;
            cur = nex;
            
            cou++;
            len--;
        }
        
        if(cur != null && len >= k){
            head.next = reverseKGroup(cur, k);
        }else{
            head.next = cur;
        }
        
        return pre;
    }
    }
