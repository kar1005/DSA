class NthNodeDelFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        while(fast!=null&&fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        if(fast==null)
            return head.next;
        slow.next = slow.next.next;
        return head;
    }
}