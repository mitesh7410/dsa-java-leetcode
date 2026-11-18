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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)  return head;
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy, curr = head;
        while(curr!=null&&curr.next!=null){
            ListNode next = curr.next;
            ListNode nxtnxt = curr.next.next;
            next.next = curr;
            curr.next = nxtnxt;
            prev.next = next;
            prev = curr;
            curr = nxtnxt;
        }
        
        return dummy.next;
    }
}