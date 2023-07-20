package Searching;

public class LinearSearch {
    static int linearSearch(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i] == target)  // target elemnt is fount at i th index
                return i;
        }
        return -1;   // tareget element not found
    }
    public static void main(String[] args) {
        int[] arr ={5,2,6,7,34,9};
        int target =34;
        System.out.println(linearSearch(arr,target));
    }
}
