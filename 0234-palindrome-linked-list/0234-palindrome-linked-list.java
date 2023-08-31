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
   public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode mid=middleNode(head);
        ListNode reversed=reverseList(mid);
        ListNode rev=reversed;
        while (temp!=null && reversed!=null){
            if(temp.val!=reversed.val) break;
            temp=temp.next;
            reversed=reversed.next;
        }
        reverseList(rev);
        return temp==null || reversed==null;
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