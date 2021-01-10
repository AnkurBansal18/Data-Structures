class solve{
    public static long[] nextLargerElement(long[] arr, int n) { 
       
        long[]nle = new long[n];
        Stack<Long> st = new Stack<Long>();
        st.push(arr[arr.length-1]);  //arr[n]
        nle[arr.length-1] = -1;
        for(int i=arr.length-2; i>=0; i--){
            while(st.size()>0 && arr[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nle[i] = -1;
            }
            else{
                nle[i]= st.peek();
            }
            st.push(arr[i]);
        }
        return nle;
        
    } 
}
