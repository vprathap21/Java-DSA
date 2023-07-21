package TwoPointer;

import java.util.Arrays;

class ReverseString {
    public static char[] reverseString(char[] s) {
       int n=s.length;
       int i=0,j=n-1;
       while(i<j) {
           char temp =s[i];
           s[i] = s[j];
           s[j] = temp;
           i++;
           j--;
       }
       return s;
    }

    public static void main(String[] args) {
        char[] arr ={'p','r','a','t','h','a','p'};
        System.out.println(Arrays.toString(reverseString(arr)));
    }
}