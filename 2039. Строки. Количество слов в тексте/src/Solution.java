import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine ();
        int countOfWords = 0;
        for (int i = 0; i < str.length (); ++i) {
            int nextWordLength = 0;
            while (i < str.length () && Character.isLetter (str.charAt (i))) {
                ++i;
                ++nextWordLength;
            }
            if (nextWordLength > 0) ++countOfWords;
        }
        System.out.println (countOfWords);
    }
}
