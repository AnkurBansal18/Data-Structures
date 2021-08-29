import java.util.*;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        cyclesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclesort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){       //arr[i] = currentIndex
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[]arr , int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

//insight: when given numbers from range 1 to N, then use cycle sort.
//ex: Given an array nums containing n distinct numbers in the range [0, n]
