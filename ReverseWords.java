public class ReverseWords {

    public static void main(String[] args) {

        String phrase = "a sky is blue";

        reverseWord(phrase);
    }

    // method
    /*
     * to reverse words in a phrase, we need to split the input string into
     * individual words,
     * reverse their order and concatenate the words with spaces
     */
    public static void reverseWord(String phrase) {

        String[] words = phrase.trim().split("\\s+");
        String out="";

        for (int i = words.length - 1; i >= 0; i--) {
            out += words[i] + " ";

        }
        System.out.println(out);
    }

}
