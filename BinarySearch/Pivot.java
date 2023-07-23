package BinarySearch;

public class Pivot {

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid  = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if(mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(nums[mid] <= nums[start])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 15, 18, 2, 5, 6, 8};
        int ans = findPivot(arr);
        System.out.println(arr[ans]);
    }
}
