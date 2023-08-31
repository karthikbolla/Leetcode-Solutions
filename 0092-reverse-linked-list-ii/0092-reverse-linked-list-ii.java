/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode temp=head;
        ListNode prev=null;
        for(int i=0;i<left-1;i++){
            prev=temp;
            temp=temp.next;
        }
        ListNode start=prev;
        ListNode end=temp;
        ListNode next=temp.next;
        for(int i=0;temp!=null && i<right-left+1;i++){
            temp.next=prev;
            prev=temp;
            temp=next;
            if(next!=null) next=next.next;
        }
        if(start!=null) start.next=prev;
        else head=prev;
        end.next=temp;
        return head;
    }
}