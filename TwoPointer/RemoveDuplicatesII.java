package TwoPointer;

class RemoveDuplicatesII {
    public static int removeDuplicates(int[] nums) {
       int l =0,r=0;
       while(r<nums.length) {
           int count =1;
           while(r+1<nums.length && nums[r] == nums[r+1]){
               count++;
               r++;
           }
           for(int i=0;i<Math.min(2,count);i++){
               nums[l] = nums[r];
               l++;
           }
           r++;
       }
       return l;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};
        int n =removeDuplicates(arr);
        for(int i=0;i<n;i++) {
            System.out.print(" "+arr[i]);
        }
    }

}