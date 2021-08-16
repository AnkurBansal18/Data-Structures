1. Brute:
Simply sort the array .
time Complexity: nlog(n)

2. A better approach can be to count number of 0's , 1's and 2's in the array in a single pass and then filling the array using the obtained counts in another pass.
loop through and put 0's at the first cout(0) positions and so on for 1's and 2's.)

time Complexity: O(n)

3. The optimal approach is to use dutch national flag algorithm. (single pass)

class Solution {
public void sortColors(int[] nums) {

     int n = nums.length;
      int i = 0;
      int j = 0;
      int k = n-1;
    

   while(i<=k){
       
   if(nums[i]==0){
       swap(nums,i,j);
       i++;
       j++;
       }
      else if(nums[i]==1)
       {
           i++;
       }
       else{
           swap(nums,i,k);
           k--;
       }
      }
}
    public void swap(int[]nums, int i, int j){
        int temp = nums[i];
       nums[i] = nums[j];
        nums[j] = temp;
    }
}

time Complexity: O(n)
