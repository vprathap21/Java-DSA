package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = search(nums,target,true);
        if(ans[0] != -1)
            ans[1] = search(nums, target,false);
        return ans;
    }

    static int search(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(target == nums[mid]) {
                if(isFirst)
                    end = mid;
                else
                    start = mid;
            }
            else if(target < nums[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,7,7,8,8,8,9,10};
        int target =8;
        int[] ans =searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

}
