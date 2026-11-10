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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for(ListNode a: lists){
            if(a!=null)
            pq.offer(a);
        }
        ListNode ans = new ListNode(0);
        ListNode temp1 = ans;
        while(!pq.isEmpty()){
           ListNode temp = pq.poll();
           temp1.next=temp;
           temp=temp.next;
           temp1=temp1.next;
           if(temp!=null)
           pq.offer(temp);
        }
        return ans.next;
    }
}