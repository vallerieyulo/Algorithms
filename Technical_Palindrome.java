import java.util.Scanner;

public class Technical_Palindrome {
/*
 * Create a palindrome checker without help from google or anything!
 * 
 */
    public static void main (String[] args){
       
        System.out.println("Enter the phrase you want to check: ");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();
        System.out.println("Is it palindrome? " + isPalindrome(phrase));
        scanner.close();

    }



    //methods
    public static boolean isPalindrome(String phrase){

        boolean isPalindrome = true;

        String cleanPhrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int start = 0;
        int end = cleanPhrase.length() - 1;

        while (start < end){
            if (cleanPhrase.charAt(start) != cleanPhrase.charAt(end)){
                return isPalindrome = false;
            }
            start++;
            end--;
        }
        return isPalindrome;
    }

}
