package BinarySearch;

public class NextGreaterstLetter {

    static char nextGreaterstLetter(char[] letters, char target) {
        if(letters[letters.length-1] <= target)
            return letters[0];
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;

        }
        return letters[start];

    }

    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreaterstLetter(arr, target));
    }

}
