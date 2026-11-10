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
    private ListNode reverse(ListNode temp1, ListNode temp2){
        ListNode temp = null;
        while(temp1!=temp2){
            ListNode curr = temp1.next;
            temp1.next = temp;
            temp = temp1;
            temp1 = curr; 
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
       if(head==null) return null;
       ListNode tail= head;
       for(int i=0;i<k;i++){
        if(tail==null) return head;
        tail=tail.next;
       }
       ListNode newHead = reverse(head, tail);
       head.next = reverseKGroup(tail,k);
       return newHead;
    }
}