package SlidingWindow;

class NumOfSubarrays {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int i=0,j=0,ans=0,sum=0;
        while(j<arr.length) {
            sum +=arr[j];
            if(j-i+1<k)
                j++;
            else if(j-i+1 == k) {
                if(sum/k >= threshold)
                    ans++;
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {11,13,17,23,29,31,7,5,2,3};
        int k=3;
        int threshold=5;
        System.out.println(numOfSubarrays(arr,k,threshold));
    }
}