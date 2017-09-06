import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    private static Pair <HashMap <String, Integer>, Integer> MakeWordFrequences ( StringBuilder input ) {
        HashMap <String, Integer> wordsFrequences = new HashMap <> ();
        Integer maxOccurrences = 0;
        for (int i = 0 ; i < input.length () ; ++i) {
            StringBuilder word = new StringBuilder ();
            for (int k = i ; k < input.length () &&
                    (input.charAt (k) >= 'a' && input.charAt (k) <= 'z' || input.charAt (k) >= 'A' && input.charAt (k) <= 'Z') ; ++k)
                word.append (input.charAt (k));
            String key = word.toString ().toLowerCase ();
            if (key.length () > 0) {
                if (!wordsFrequences.containsKey (key)) wordsFrequences.put (key, 0);
                wordsFrequences.put (key, wordsFrequences.get (key) + 1);
                if (maxOccurrences < wordsFrequences.get (key)) maxOccurrences = wordsFrequences.get (key);
                i += key.length ();
            }
        }

        return new Pair <> (wordsFrequences, maxOccurrences);
    }

    public static void main ( String[] args ) throws IOException {
        StringBuilder input = new StringBuilder ();
        Scanner scanner = new Scanner (System.in);
        input.append (new Scanner(System.in).useDelimiter("\\A").next());
        Pair <HashMap <String, Integer>, Integer> pair = MakeWordFrequences (input);
        HashMap <String, Integer> wordFrequences = pair.getKey ();
        Integer maxOccurrences = pair.getValue ();
        ArrayList <String> sortedWordsResult = new ArrayList <> ();
        for (Map.Entry <String, Integer> entry : wordFrequences.entrySet ()) {
            String key = entry.getKey ();
            Integer value = entry.getValue ();
            if (maxOccurrences == value) sortedWordsResult.add (key);
        }
        sortedWordsResult.sort (String:: compareTo);
        for (int i = 0 ; i < sortedWordsResult.size () ; ++i)
            System.out.println (sortedWordsResult.get (i));
    }
}
