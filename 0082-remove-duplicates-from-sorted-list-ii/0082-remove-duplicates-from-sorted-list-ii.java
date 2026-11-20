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
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy,curr = head;
        while(curr!=null&&curr.next!=null){
            ListNode next = curr.next;
            boolean  b = false;
            while(next!=null&&curr.val==next.val){
                next = next.next;
                b =  true;
            }
            if(b){
                prev.next = next;
                curr = next;
            }
            else{
            prev = curr;
            curr = next;
            }
        }
            
        return dummy.next;    
    }
}