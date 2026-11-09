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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0;
        while(l1!=null&&l2!=null){
           int add = l1.val+l2.val+carry;
           if(add>9){
            temp.next=new ListNode(add%10);
            temp = temp.next;
            carry=1;
           }else{
                temp.next=new ListNode(add);
                temp = temp.next;
                carry=0;
           }
           l1=l1.next;
           l2=l2.next;  
        }
        while(l1!=null){
            int add = l1.val+carry;
            
           if(add>9){
            temp.next=new ListNode(add%10);
            temp = temp.next;
            carry =1;
            }
            else{
                temp.next=new ListNode(add);
                temp = temp.next;
                carry = 0;
            } 
            l1=l1.next;
        }

        while(l2!=null){
            int add = l2.val+carry;
 
            if(add>9){
                temp.next=new ListNode(add%10);
                temp = temp.next;
                carry = 1;
            }
            else{
                temp.next=new ListNode(add);
                temp = temp.next;
                carry = 0;
            } 
            l2=l2.next;
        }
        if(carry==1)
        temp.next = new ListNode(carry);
        
        return ans.next;
    }
}