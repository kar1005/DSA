public class FindingLoopInLL {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(slow!=null&&fast!=null){
            if(fast.next==null)
                return false;
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}