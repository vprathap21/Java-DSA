package BinarySearch;

public class First1InInfinitBinarySortedArray {

    static int ans(int[] nums) {
        int start = 0;
        int end  =1;
        while(1 > nums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return search(nums, start, end);
    }

    static int search(int[] nums, int start, int end) {
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == 1)
                end = mid;
            else if(nums[mid] < 1)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
        int ans = ans(arr);
        System.out.println(ans);
    }
}
