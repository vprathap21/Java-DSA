package BinarySearch;

public class OrderAgnosticBS {

    static int orderAgnosticBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
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
        int[] arr = {5, 4, 3, 2, 1, 0, -1, -2, -5};
        int target = -2;
        System.out.println(orderAgnosticBS(arr,target));
    }

}
