import java.util.*:
class Solution {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
       int[]height = new int[n];
       for(int i=0; i<n; i++){
       heights[i] = sc.nextInt();
       }
     
      //  for(int i=1; i<heights.length; i++){
      //     if(heights[i] == heights[i-1])
       //        return heights[i]*heights.length;
        
         int[]rb = new int[heights.length];
         Stack<Integer>st = new Stack<>();
        st.push(heights.length-1);
        
             rb[heights.length - 1] = heights.length;
        
            for(int i= heights.length -2; i>=0; i--){
                while(st.size()>0 && heights[i]< heights[st.peek()]){
                    st.pop();
                }
                if(st.size()==0){
                    rb[i] = heights.length;
                }
                else{
                    rb[i] =st.peek();
                }
                st.push(i);
            }
        
         
        
        
         int[]lb = new int[heights.length];
        
        st = new Stack<>();
        st.push(0);
             lb[0] = -1;
            for(int i= 1; i<heights.length; i++){
                while(st.size()>0 && heights[i] < heights[st.peek()]){
                    st.pop();
                }
                if(st.size()==0){
                    lb[i] = -1;
                }
                else{
                    lb[i] =st.peek();
                }
                st.push(i);
            }
        
        //Area
        
        int MaxArea =0;
         for(int i=0; i<heights.length; i++){
            int width = rb[i] - lb[i] -1;
             int area = width*heights[i];
             if(area>MaxArea){
                 MaxArea=area;
             }
         }
       return(MaxArea);
    }
}





















// steps:
// 1. for each building -> a) find right boundary(nearest smaller to right) ->rb[]
//                         b) find left boundary(nearest smaller to left).  ->lb[]

// 2. calculate width (means how much a bar can expand to its left and right).
    
//     rb[i]-lb[i]-1
    
// 3. calculate area for each height.
//     area[i] = width[i]*height[i]
    
// 4. finally return maximum area.
