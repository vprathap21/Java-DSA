package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void cyclicSort(int[] nums) {
        int n= nums.length;
        int i=0;
        while(i<n) {
            int curent = nums[i]-1;
            if(nums[i] != nums[curent])
                swap(nums,curent,i);         // if the curent element is not corect indext swap it at the corect position
            else
                i++;
        }

    }
    static void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
