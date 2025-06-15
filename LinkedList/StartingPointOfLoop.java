public class StartingPointOfLoop {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null && fast!=null){
            if(fast.next==null)
                return null;
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow= slow.next;
                    fast = fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}