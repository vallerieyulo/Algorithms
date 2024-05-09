public class OccurrenceIndex {

    public static void main(String[] args) {

        String needle = "sad";
        String haystack = "sadbutsad";
        System.out.println("haystack: " + strStr(needle, haystack));

    }

    // method

    public static int strStr(String needle, String haystack) {

        /*
         * first condition: You need to verify if the needle is greater than the
         * haystack.
         * If yes, then haystack automatically does not contain needle.
         * Next, you need to loop inside haystack
         * 
         */

        int needleLen = needle.length();
        int hayLen = haystack.length();
        int index = -1;

        if (needleLen > hayLen) {
            return index = -1;
        }
        // if (haystack.contains(needle)) {
        // return index = 1;
        // }

        for (int i = 0; i < hayLen; i++) {
            for (int j = 0; j < needleLen; j++) {
                if(needle.charAt(j) == haystack.charAt(i)){
                    return index = 1;
                }else {
                    i++;
                    
                }
            }

        }

        return index;
    }
}
