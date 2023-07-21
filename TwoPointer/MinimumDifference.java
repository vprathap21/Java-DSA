package TwoPointer;

import java.util.Arrays;
//Input: nums = [9,4,1,7], k = 2
//Output: 2
//[1,4,7,9]
class MinimumDifference {
    public static int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int ans =Integer.MAX_VALUE;
       int right=k-1,left=0;
       while(right<nums.length) {
           ans =Math.min(ans,nums[right]-nums[left]);
           right++;
           left++;;
       }
       return ans;

    }

    public static void main(String[] args) {
        int[] nums ={9,4,1,7,8,12,3};
        int k=3;
        System.out.println(minimumDifference(nums,k));
    }
}