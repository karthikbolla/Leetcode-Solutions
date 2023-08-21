/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int len=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                do{
                    slow=slow.next;
                    len++;
                }while(fast!=slow);
                break;
            }
        }
        if(len==0){
            return null;
        }
        ListNode first=head;
        ListNode second=head;
        while(len>0){
            second=second.next;
            len--;
        }
        while(first!=second){
            first=first.next;
            second=second.next;
        }
        return second;
    }
    
}
