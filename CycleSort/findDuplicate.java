//question: https://leetcode.com/problems/find-the-duplicate-number/submissions/

//SOLUTION 1: WITH EXTRA SPACE

class Solution {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> hs =  new HashSet<Integer>();
        for(int x : nums){
            if(hs.contains(x))
                return x;
            hs.add(x);
        }
        
        return -1;
    }
}


*//SOLUTION 2: WITHOUT EXTRA SPACE

class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] != i+1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {       
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[]arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
