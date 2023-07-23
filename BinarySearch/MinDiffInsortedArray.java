package BinarySearch;

public class MinDiffInsortedArray {

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return 0;
            else if(nums[mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return Math.abs(nums[start] - target) < Math.abs(nums[end] - target) ? Math.abs(nums[start] - target) : Math.abs(nums[end] - target);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,8,10,15};
        int target = 12;
        int ans =search(arr, target);
        System.out.println(ans);
    }
}
