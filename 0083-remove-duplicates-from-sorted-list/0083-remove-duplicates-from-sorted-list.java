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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode temp = head, next = head.next;
        while(next!=null){
            if(temp.val==next.val){
                temp.next = next.next;
                next=next.next;
            }
            else{
                temp=temp.next;
                next =next.next;
            }
        }
        return head;
    }
}