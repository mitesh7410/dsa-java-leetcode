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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return ;
        Deque<ListNode> q = new ArrayDeque<>();
        ListNode temp = head;
        while(temp!=null){
            q.addLast(temp);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(0);
        temp = dummy;
        while(!q.isEmpty()){
            temp.next =q.pollFirst();
            temp= temp.next;
            if(!q.isEmpty()){
                temp.next = q.pollLast();
                temp = temp.next;
            }    
        }
        temp.next = null;
    }
}