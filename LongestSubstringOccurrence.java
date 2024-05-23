import java.util.HashMap;

public class LongestSubstringOccurrence {



    public static void longestSubstringOccurrence(String str){

        int maxLenOfSubstr = 0;   
        int strLen = str.length();
        int start = 0; // represent the current index of substring

        HashMap<Character, Integer> subString = new HashMap<>();


        for (int end = 0; end < strLen; end++ ){
            char currentChar = str.charAt(end);

            if (subString.containsKey(currentChar) && subString.get(currentChar) >= start){
                start = subString.get(currentChar) + 1;
            }

            subString.put(currentChar, end);
            maxLenOfSubstr = Math.max(maxLenOfSubstr, (end-start +1));

        }

        System.out.println("The substring without repeating characters is: " + subString.keySet());
        System.out.println("The length of the substring is: " + maxLenOfSubstr);


    }

    public static void main(String[] args) {
        
        String str = "valvalvvv";
        longestSubstringOccurrence(str);
    }
}
