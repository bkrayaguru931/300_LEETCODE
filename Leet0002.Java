//2. Add Two Numbers

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumNode = new ListNode();
    ListNode headOfSumNode = sumNode;
	int sum = 0;
    int carry = 0;

    while( l1 != null || l2 != null || carry > 0 )
    {
        sumNode.next = new ListNode();
        sumNode = sumNode.next;

        if( l1 != null && l2 != null){
            if( carry>0 ){
                sum = l1.val + l2.val + carry;
            }else{
                sum = l1.val + l2.val;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        else if( l1 == null && l2 == null ){
            sum = carry;
        }
        else if( l1 == null){
            if( carry > 0 ){
                sum = l2.val+carry;
            }
            else{
                sum = l2.val;
            }
            l2 = l2.next;
        }
        else{
            if( carry > 0 ){
                sum = l1.val + carry;
            }
            else{
                sum = l1.val;
            }
            l1 = l1.next;
        }

        if(sum > 9){
            sumNode.val = (sum % 10);
            carry = sum/10;
        }else{
            sumNode.val = sum;
            carry=0;
        }
        sumNode.next = null;
    }
    return headOfSumNode.next;
    }
}
