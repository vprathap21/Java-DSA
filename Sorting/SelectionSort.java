package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] nums ) {
        int n= nums.length;
        for(int i=0; i<n-1; i++) {
            int minIndex = i;
            for(int j=i+1;j<n;j++) {
                if(nums[j]<nums[minIndex])
                    minIndex = j;
            }
            swap(nums, minIndex,i);
        }
    }
    static void swap(int[] nums ,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
