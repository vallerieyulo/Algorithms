import java.util.HashMap;

public class minMaxOccurrence {

    public static void minMaxOccurrence(String str) {

        char[] stringArr = str.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : stringArr) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            } else {
                charCount.put(c, 1);
            }
        }
        int minOccur = Integer.MAX_VALUE;
        int maxOccur = Integer.MIN_VALUE;

        for (int count : charCount.values()) {
            // System.out.println("min "+minOccur);
            minOccur = Math.min(minOccur, count);
            // System.out.println("count: "+count);

            // System.out.println("max "+maxOccur);
            maxOccur = Math.max(maxOccur, count);
            // System.out.println("count: "+count);

        }

        System.out.println("The Minimum occurrence is: " + minOccur);
        System.out.println("The Maximum occurrence is: " + maxOccur);

    }

    public static void main(String[] args) {

        String str = "aaaababa";
        minMaxOccurrence(str);
    }
}
