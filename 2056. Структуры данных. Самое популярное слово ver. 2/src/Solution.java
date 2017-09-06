import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main ( String[] args ) throws IOException {
        //Scanner scanner = new Scanner (System.in);
        Map <String, Integer> wordCount = new HashMap <> ();
        int maxOccurances = 0;
        String input = new Scanner(System.in).useDelimiter("\\A").next();
        /*while (scanner.hasNext()) input+=scanner.nextLine ();*/
        String[] str = input.split ("( |\n)");
        for (int i = 0; i<str.length; ++i) {
            String key = str[i].toLowerCase ().trim ();
            if (key.length ()>0) {
                if (!wordCount.containsKey (key)) wordCount.put (key, 0);
                wordCount.replace (key, wordCount.get (key) + 1);
                if (maxOccurances < wordCount.get (key)) maxOccurances = wordCount.get (key);
            }
        }
        List <String> wordsWithMaxOccurances = new LinkedList <> ();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet ()){
            String key = entry.getKey ();
            Integer value = entry.getValue ();
            if (value == maxOccurances) wordsWithMaxOccurances.add (key);
        }
        wordsWithMaxOccurances.sort (String::compareTo);
        for (int i = 0; i < wordsWithMaxOccurances.size (); ++i) {
            System.out.println (wordsWithMaxOccurances.get (i));
        }

    }
}
