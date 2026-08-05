class Solution {
    public int[] plusOne(int[] digits) {
         List<Integer> ans = new LinkedList<>();
         int carry=1;
         for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            ans.addFirst(sum % 10); 
            carry = sum / 10;             
        }
        if (carry > 0) {
            ans.addFirst(carry);
        }
        
        int[] result = new int[ans.size()];

        for(int i=0;i<ans.size();i++)
         result[i]=ans.get(i);


        return result; 
       
    }
}