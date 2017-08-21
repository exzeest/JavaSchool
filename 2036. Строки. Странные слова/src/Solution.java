import java.util.*;

public class Solution {
    private static final ArrayList<Character> vowels = new ArrayList<Character> () {
        {
            add ('e');
            add ('y');
            add ('u');
            add ('i');
            add ('o');
            add ('a');
        }
    };

    private static boolean IsWordStrange (String word) {
        boolean result = false;
        int coutOfVowelsInRow = 0;
        for (int i = 0; i < word.length (); ++i) {
            while (i < word.length () && vowels.contains (word.charAt (i))) {
                ++i;
                ++coutOfVowelsInRow;
                result = coutOfVowelsInRow > 2;
                if (result) break;
            }
            if (result) break;
            coutOfVowelsInRow = 0;
        }
        return result;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        ArrayList<String> words = new ArrayList<> ();
        for (int i = 0; i < n; ++i) {
            words.add (scanner.next ());
        }
        ArrayList<Integer> indexesOfStrangeWords = new ArrayList<> ();
        for (int i = 0; i < words.size (); ++i) {
            if (IsWordStrange (words.get (i))) indexesOfStrangeWords.add (i);
        }

        for (int i = 0; i < words.size (); ++i) {
            if (!indexesOfStrangeWords.contains (i))
                System.out.println (words.get (i));
        }
    }
}
