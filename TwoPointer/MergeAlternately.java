package TwoPointer;

class MergeAlternately {
    public static String mergeAlternately(String word1, String word2) {
        String s="";
        int i=0,j=0;
        while(i<word1.length() && j<word2.length()){
            s +=word1.charAt(i);
            s +=word2.charAt(j);
            i++;
            j++;
        }
        while(i<word1.length()){
            s +=word1.charAt(i);
            i++;
        }
        while(j<word2.length()) {
            s +=word2.charAt(j);
            j++;
        }
        return s;
    }


    public static void main(String[] args) {
        String s1="prathap";
        String s2 ="seetha";
        System.out.println(mergeAlternately(s1,s2));
    }
}