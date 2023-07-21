package TwoPointer;

import java.util.Arrays;

class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int i=0,j=0;
       while(i<m && j<n) {
           if(nums1[i]>nums2[j]){
               int temp=nums1[i];
               nums1[i] =nums2[j];
               nums2[j] = temp;
               
           }
           i++;
           
       }
       while(i<n+m && j<n) {
           nums1[i] = nums2[j];
           i++;
           j++;
       }
    }

    public static void main(String[] args) {
        int[] arr1 ={1,2,3,0,0,0};
        int[] arr2 ={2,5,6};
        merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));
    }
}