package TwoPointer;

public class ValidPalindromeII {
    public static boolean validPalindromeII(String s) {
        int n = s.length();
        int left =0,right =n-1,count = 0;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return isPalindrome(s,left,right-1) || isPalindrome(s,left+1,right);
            }
            left++;
            right--;
        }
        return true;
    }
    static boolean isPalindrome(String s,int left, int right) {
        while(left<right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
     String s ="abca";
        System.out.println(validPalindromeII(s));
    }
}
