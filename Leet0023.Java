//23. Merge k Sorted Lists



class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        
        for (ListNode node: lists) {
            while (node != null) {
                minHeap.add(node.val);
                node = node.next;
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while (minHeap.size() != 0) {
            node.next = new ListNode(minHeap.poll());;
            node = node.next;
        }
        
        return dummy.next;
    }
}
