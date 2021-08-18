

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[]nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = searchRange(nums, target);
        System.out.println(res);
    }

    public static int[] searchRange(int[] nums, int target) {
        int res[] = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        res[0] = start;
        res[1] = end;
        return res;
    }
    
     static int search(int[]nums, int target, boolean firstIndex){
        int res  = -1;
         int low = 0;
         int high = nums.length-1;
         while(low<=high) {
             int mid = low + (high - low) / 2;
             if (target > nums[mid]) {
                 low = mid + 1;
             } else if (target < nums[mid]) {
                 high = mid - 1;
             } else {
                 res = mid;
                 if (firstIndex) {
                     high = mid - 1;
                 } else {
                     low = mid + 1;
                 }
             }
         }
         return res;
     }

}
