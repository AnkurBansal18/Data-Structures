//question: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i] != nums[correctIndex]){       //nums[i] = currentIndex
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        
        for (int index =0; index<nums.length; index++){
            if(nums[index] != index+1){
                res.add(index+1);
            }
        }
        return res;

    }
         //swap
         static void swap(int[]arr , int a, int b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }

}
