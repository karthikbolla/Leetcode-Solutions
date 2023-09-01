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
    public void reorderList(ListNode head) {
        if(head== null || head.next==null) return;
        ListNode temp=head;
        ListNode mid=middleNode(temp);
        ListNode reverse=reverseList(mid);
        while(temp!=null && reverse !=null){
            ListNode temp1=temp.next;
            temp.next=reverse;
            temp=temp1;
            temp1=reverse.next;
            reverse.next=temp;
            reverse=temp1;
        }
        if(temp!=null) temp.next=null;
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp1=head;
        ListNode temp2=head;
        while(temp2!=null && temp2.next!=null){
            temp1=temp1.next;
            temp2=temp2.next.next;
        }
        return temp1;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode pres=head;
        ListNode prev=null;
        ListNode next=pres.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
}