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
        if(head==null)return head;
        ListNode temp = new ListNode(head.val);
        ListNode t = temp;
        Set<Integer>set = new HashSet<>();
        set.add(head.val);
        while(head!=null){
            if(!set.contains(head.val)){
                t.next = new ListNode(head.val);
                t=t.next;
                set.add(head.val);
            }
            head = head.next;
        }
        

        return temp;
    }
}