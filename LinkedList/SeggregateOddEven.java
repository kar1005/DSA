//Intution:Two heads:one for odd and one for even
//Two pointers:odd points to last odd index element and even to last even index element
class SeggregateOddEven {
    public ListNode oddEvenList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode ehead = head.next;
        ListNode odd = head;
        ListNode even = head.next;
        while(even.next!=null && odd.next!=null){
            odd.next = even.next;
            odd = odd.next;
            if(odd.next!=null){
                even.next = odd.next;
                even = even.next;
            }
        }
        odd.next = ehead;
        even.next = null;
        return head;
    }
}