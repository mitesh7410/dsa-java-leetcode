class ProductOfNumbers {
    ListNode product;
    public ProductOfNumbers() {
        product = null;
    }
    
    public void add(int num) {
        ListNode add = new ListNode(num);
        add.next = product;
        product=add;
    }
    
    public int getProduct(int k) {
        int mul=1;
        ListNode temp = product;
        while(k-->0){
            mul*=temp.val;
            temp=temp.next;
        }
        return mul;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */