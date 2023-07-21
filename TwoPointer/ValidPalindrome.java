package TwoPointer;

import java.util.Locale;
// if both characters are alphanumeric then only compare if anyone of charter is not alphanumeric increase or decrease the pointer accordingly
public class ValidPalindrome {
    public static boolean validPalindrome(String s) {
        int left = 0 , right =s.length()-1;
        while(left<right) {
            while(left<right && !isAlphaNumeric(s.charAt(left)))
                left++;
            while(left<right && !isAlphaNumeric(s.charAt(right)))
                right--;
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
                return false;

            left++;
            right--;

        }
        return true;
    }

    static boolean isAlphaNumeric(char c) {
        return ('A'<= c && 'Z'>=c) || ('a'<=c && 'z'>=c) ||('0'<=c && '9'>=c) ;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(validPalindrome(s));
    }
}
