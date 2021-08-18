

public class SearchInInfiniteArray {
    public static void main(String[] args) {
         int[]arr = {23, 25, 34, 45, 49, 56, 67, 89,93,99, 101, 120, 500, 656};
         int target = 500;
         int res = infnitesearch(arr, target);
        System.out.println(res);
    }


    static int infnitesearch(int[] arr, int target) {
        int low = 0;
        int high = 1;
        while (arr[high] < target) {
            low = high;
            high = 2 * high;
        }
        return binarySearch(arr, target, low, high);
    }

    static int binarySearch(int[] arr, int target, int low, int high) {
//        int low = 0;
//        int high = arr.length-1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
