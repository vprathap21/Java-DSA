package TwoPointer;

class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        
        int j=0;
        for(int i=1;i<nums.length;i++) {
            if(nums[j]!= nums[i]){
                j++;
                nums[j]=nums[i];
            }
            
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int n =removeDuplicates(arr);
        for(int i=0;i<n;i++) {
            System.out.print(" "+arr[i]);
        }
    }
}