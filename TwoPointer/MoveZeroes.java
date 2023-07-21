package TwoPointer;

import java.util.Arrays;

class MoveZeroes {
    public static void moveZeroes(int[] nums) {

     int i=0;
     for(int j=0;j<nums.length;j++) {
         if(nums[j] != 0)
         {
            swap(nums,i,j);
            i++;
         }
     }

    }
    public static void swap(int[] nums,int num1, int num2) {
        int temp = nums[num1];
        nums[num1] = nums[num2];
        nums[num2] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}