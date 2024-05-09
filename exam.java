import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class exam {

    /*
     * Complete the 'simpleCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING encrypted
     *  2. INTEGER k
     */

    public static String simpleCipher(String encrypted, int k) {
    // Write your code here

    Character[] cipher = new Character[encrypted.length()];
    ArrayList<Character> alphabet = new ArrayList<>();
    
    char[] encryptedArr = encrypted.toCharArray();
    
    
    for (char ch= 'z'; ch >= 'a'; ch--){
        alphabet.add(ch);
    }
    
    for(int i=0; i<alphabet.size(); i++){
        for (int j=0; j<encryptedArr.length; j++){
            if(alphabet.get(i) ==  encryptedArr[j]){
                cipher[i] = alphabet.get(i+k); 
                System.out.println(cipher);
            }
        }
        
    }
    
    return cipher.toString();
    }

    public static void main(String[] args) throws IOException {
       
        System.out.println(simpleCipher("ABC", 2));

    }

}

