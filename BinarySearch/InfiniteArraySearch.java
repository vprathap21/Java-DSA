package BinarySearch;

public class InfiniteArraySearch {

    static int ans(int[] nums, int target) {
        int start = 0;
        int end = 1;
        while(target > nums[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
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
        int[] arr = {-5, -3, -1, 0 , 1, 2, 3, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,19, 20 , 25, 29, 30, 35};
        int target = 12;
        int ans =ans(arr,target);
        System.out.println(ans);
    }

}
