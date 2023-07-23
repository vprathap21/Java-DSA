package BinarySearch;

public class RotationCount {

    static int countRotation(int[] nums) {
        int pivot = finPivot(nums);
        return pivot + 1;
    }

    static int finPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && nums[mid] > nums[mid + 1])
                return mid;
            if(mid > start && nums[mid] < nums[mid - 1])
                return mid - 1;
            if(nums[mid] <= nums[start])
                end  = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={4, 5, 6, 7, 0, 1, 2};
        int ans = countRotation(arr);
        System.out.println(ans);
    }
}
