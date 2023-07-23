package BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] nums,int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid])
                return mid;
            else if(target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-5, -3, -1, 0, 1, 2, 3, 4, 5};
        int target =0;
        System.out.println(binarySearch(arr,target));
    }

}
