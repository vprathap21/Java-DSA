package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] nums) {
        int n = nums.length;
        for(int i=1; i<n; i++) {
            int key =nums[i];
            int j =i-1;
            while(j>=0 && nums[j]>key) {     // moving the element greater than key to one index ahead
                nums[j+1] =nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
