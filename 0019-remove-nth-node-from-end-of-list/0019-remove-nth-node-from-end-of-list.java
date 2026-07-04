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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode dummy = new ListNode(0,head);
       ListNode temp = dummy;
       int count=0;
       while(temp.next!=null) {
        temp=temp.next;
        count++;
       }
       temp=dummy;
       for(int i=0;i<count-n;i++){
        temp=temp.next;
       }
       temp.next=temp.next.next;
       return dummy.next;
    }
}