package BinarySearch;

public class PeakIndexInMountainArray {

    static int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] < nums[mid+1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8,20,15,12,7,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(arr[ans]);
    }

}
