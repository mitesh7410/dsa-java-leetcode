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
        if(head==null) return head;
        ListNode ans = new ListNode(head.val);
        ListNode temp = ans;
        while(head!=null){
            if(temp.val!=head.val){
                temp.next= new ListNode(head.val);
                temp = temp.next;
            }
            head = head.next;
        }
        return ans;
    }
}