//find greatest number smaller than target.

public class floor {
    public static void main(String[] args) {
        int arr[] = {23, 26,56, 67, 108, 120, 200,378,410};
        int target = 111;
        int res = binarySearch(arr,target);
        System.out.println(res);
    }
    static int binarySearch(int []arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low) /2;
            if(target > arr[mid]){
                low = mid+1;
            }
            else if(target<arr[mid]){
                high = mid-1;
            }
            else{
                return mid;
            }
        }
        return high;
    }
}
