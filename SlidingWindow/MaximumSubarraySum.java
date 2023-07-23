package SlidingWindow;

class MaximumSubarraySum {
    public static long maximumSubarraySum(int[] nums, int k) {
        long ans =0;
        long sum =0;
        int i=0, j=0;
        while(j<nums.length) {
            sum +=nums[j];
            if(j>i && (nums[j] == nums[i] || nums[j] == nums[j-1])) {
                i=j;

            }
            else if(j-i+1<k)
                j++;
            else {
                ans = Math.max(ans,sum);
                sum -=nums[i];
                i++;
                j++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr ={1,5,4,2,9,9,9};
        int k = 3;
        System.out.println(maximumSubarraySum(arr,k));
    }
}