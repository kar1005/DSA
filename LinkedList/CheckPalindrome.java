class CheckPalindrome {
    public boolean isPalindrome(ListNode head) {
        //Step1: find the second half as where it starts
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Step2: Reverse the second half of LL
        ListNode newHead = reverseLL(slow.next);
        //Step3: Match the LinkedList values for palindrome
        ListNode first = head;
        ListNode second = newHead;
        while(second!=null){
            if(first.val!=second.val){
                newHead = reverseLL(newHead);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        //Make the LL in its original configuration
        newHead = reverseLL(newHead);
        return true;
    }
    public ListNode reverseLL(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        ListNode front = head;
        while(temp!=null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}