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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        int count=1;
        ListNode temp = head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        k=k%count;
        if(k==0) return head;
        ListNode temp1 = head;
        int t = count-k;
        while(t-->1){
            temp1=temp1.next;
        }
        ListNode temp2=temp1.next;
        temp1.next = null;
        temp.next=head;
        head = temp2;
        
        return head;
    }
}