class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {       //arr[i] = currentIndex
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }

        }
        return nums.length;                     //last possible element missing.
    }
  
  //swapping
    static void swap(int[]arr , int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    } 
 }
