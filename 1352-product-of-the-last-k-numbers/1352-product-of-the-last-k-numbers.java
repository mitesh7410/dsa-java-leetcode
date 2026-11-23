class ProductOfNumbers {
    ArrayList<Integer> product;
    public ProductOfNumbers() {
        product = new ArrayList<>();
        product.add(1);
    }
    
    public void add(int num) {
        if(num==0){
            product.clear();
            product.add(1);
        }else
        product.add(num*product.get(product.size()-1));
    }
    
    public int getProduct(int k) {
        int size = product.size();
        if(k>=size) return 0;
        return product.get(size-1)/product.get(size-k-1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */