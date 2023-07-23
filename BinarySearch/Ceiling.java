package BinarySearch;

public class Ceiling {

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid])
                return mid;
            else if(target < arr[mid])
                end =  mid - 1;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target =15;
        int ans = ceiling(arr,target);
        System.out.println(arr[ans]);
    }

}
