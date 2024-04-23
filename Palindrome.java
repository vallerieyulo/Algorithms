public class Palindrome {

    public static boolean isPalindrome(String phrase) {

        String cleanedPhrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(cleanedPhrase);

        int start = 0;
        int end = cleanedPhrase.length() - 1;
        String reversed = "";

        while (start < end) {
            reversed = reversed + cleanedPhrase.charAt(end);
            System.out.println("reversed: " + reversed);

            if (cleanedPhrase.charAt(start) != cleanedPhrase.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }

        return true;
    }

    public static String reverse(String phrase) {
        String reversed = "";
        String cleanedPhrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("Clean: " + cleanedPhrase);
        
        for (int i = cleanedPhrase.length() - 1; i >= 0; i--) {
            reversed = reversed + cleanedPhrase.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String phrase = "A man, a plan, a canal: Panama";
        System.out.println("Phrase: " + phrase);
        // System.out.println("Is it a palindrome? " + isPalindrome(phrase));

        System.out.println("Reversed: " + reverse(phrase));
    }
}
