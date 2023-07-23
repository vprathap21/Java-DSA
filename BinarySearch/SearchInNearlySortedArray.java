package BinarySearch;

public class SearchInNearlySortedArray {
    static int search(int[] nums, int target) {
        int start = 0;
        int end  = nums.length -1 ;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;
            if(mid - 1 >= start && nums[mid-1] == target)
                return mid - 1;
            if(mid + 1 <= end && nums[mid+1] == target)
                return mid + 1;
            if(nums[mid] < target)
                start = mid + 2;
            else
                end = mid - 2;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 4, 7, 6, 8, 9};
        int target = 5;
        int ans =search(arr, target);
        System.out.println(ans);
    }
}
