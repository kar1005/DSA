class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode current=head;
        while(fast!=null&&fast.next!=null){
            current = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        current.next = slow.next;
        return head;
    }
}