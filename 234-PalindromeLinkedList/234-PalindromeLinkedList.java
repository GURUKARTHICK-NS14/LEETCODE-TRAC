// Last updated: 2/9/2026, 11:55:34 AM
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
    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode h2=null;
        while(head!=null){
            ListNode temp=head;
            head=head.next;
            temp.next=h2;
            h2=temp;
        }
        return h2;
    }
    public boolean isPalindrome(ListNode h1) {
        ListNode midel1=middleNode(h1);
        ListNode h2=reverseList(midel1);
        while(h2!=null){
            if(h1.val!=h2.val) return false;
            h1=h1.next;
            h2=h2.next;
        }
        return true;
    }
}