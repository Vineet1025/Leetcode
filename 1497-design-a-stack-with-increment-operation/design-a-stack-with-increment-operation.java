class CustomStack {
    int[] arr;
    int currsize=0;

    public CustomStack(int maxSize) {
      arr=new int[maxSize];
        
    }
    
    public void push(int x) {
        if(currsize==arr.length){
            return;
        }
        arr[currsize]=x;
        currsize++;
    }
    
    public int pop() {
        if(currsize==0){
            return -1;
        }
        int a=arr[currsize-1];
        arr[currsize-1]=0;
        currsize--;
        return a;
        
    }
    
    public void increment(int k, int val) {
        if(val==0 || currsize==0){
            return;
        }
        if(k>arr.length){
            k=arr.length;
        }
        for(int i=0; i<k; i++){
            arr[i]=arr[i]+val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */