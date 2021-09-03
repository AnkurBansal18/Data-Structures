//https://leetcode.com/problems/find-all-duplicates-in-an-array/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i =0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j=0; j<nums.length; j++){
            if(nums[j] != j+1){
                res.add(nums[j]);
            }
        }
        return res;
    }
    static void swap(int[]arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
