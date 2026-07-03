class MedianFinder {
    PriorityQueue<Integer> high = new PriorityQueue<>();
    PriorityQueue<Integer> low = new PriorityQueue<>((Integer a, Integer b) -> Integer.compare(b, a));   

    public MedianFinder() {
          
    }
    
    public void addNum(int num) {
        if(low.isEmpty()||low.peek()>=num)
        low.offer(num);
        else
        high.offer(num);
        if(low.size()>high.size()+1)
        high.offer(low.poll());
        if(high.size()>low.size()+1)
        low.offer(high.poll());
        
    }
    
    public double findMedian() {
        if(high.size()==low.size())
         return (double)(high.peek()+low.peek())/2;
        if(high.size()>low.size())
         return (double)high.peek();
         else
         return (double)low.peek();

         
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */