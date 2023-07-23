package BinarySearch;

public class SearchInMountainArray {
    static int search(int[] nums, int target) {
        int peak = findPeak(nums);
        if(nums[peak] == target)
            return peak;
        int ans = orderAgnosticBS(nums,target,0,peak - 1);
        if(ans == -1)
            ans = orderAgnosticBS(nums, target, peak + 1, nums.length - 1);
        return ans;
    }

    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid + 1])
                start = mid + 1;
            else
                end  = mid - 1;
        }
        return start;
    }

    static int orderAgnosticBS(int[] nums, int target, int start, int end) {
        boolean isAsc = nums[start] < nums[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;
            if(isAsc) {
                if(target < nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else {
                if(target > nums[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,10,15,20,30, 29,23,19,3};
        int target = 30;
        int ans =search(arr, target);
        System.out.println(ans);
    }

}
