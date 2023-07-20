package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++) {
            boolean swaped =false;
            for(int j=0; j<n-i-1; j++) {
                if(nums[j]> nums[j+1]) {
                    swap(nums,j,j+1);
                    swaped = true;
                }

            }
            if(!swaped)
                break;
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp =nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
