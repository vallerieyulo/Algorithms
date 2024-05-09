import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String word1 = "anagram";
        String word2 = "nagaram";

        isAnagram(word1, word2);
    }

    // method

    public static boolean isAnagram(String word1, String word2) {

        boolean isAnagram = true;
        char word1Arr[] = word1.toCharArray();
        char word2Arr[] = word2.toCharArray();

        // System.out.println(word1Arr);
        // System.out.println(word1Arr[1]);

        if (word1Arr.length == word2Arr.length) {
            Arrays.sort(word1Arr);
            Arrays.sort(word2Arr);

            int i=0, j=0;
            while (i < word1Arr.length && j <word2Arr.length ){
                if (word1Arr[i] == word2Arr[j]){
                    
                }
            }

        } else {
            isAnagram = false;
        }


        return isAnagram;
    }

}
