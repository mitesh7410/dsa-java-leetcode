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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next.next==null) return new int[]{-1,-1};
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = head.next.next;
        List<Integer> li = new ArrayList<>();
        int count = 2;
        while(nxt!=null){
            if(prev.val<curr.val&&nxt.val<curr.val||prev.val>curr.val&&nxt.val>curr.val){
                li.add(count);
            }
            prev=prev.next;
            curr=curr.next;
            nxt=nxt.next;
            count++;
        }
        if(li.isEmpty()){
            return new int[]{-1,-1};
        }
        li.sort(Comparator.reverseOrder());
        int size =  li.size();
        int f = li.get(0);
        int arr[]= new int[2];
        arr[0]=Integer.MAX_VALUE;
        arr[1]=Integer.MIN_VALUE;
        for(int i=1;i<size;i++){
           arr[0]=Math.min(li.get(i-1)-li.get(i),arr[0]);
           arr[1]=Math.max(f-li.get(i),arr[1]);
      
        }

        if(arr[0]==Integer.MAX_VALUE||arr[1]==Integer.MIN_VALUE)
        return new int[]{-1,-1};

        return arr;
    }
}