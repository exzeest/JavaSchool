import java.util.*;

public class Solution {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner (System.in);
        TreeMap <Integer, Integer> values = new TreeMap <> ();
        int n = scanner.nextInt ();
        for (int i = 0; i < n; ++i) {
            int operation = scanner.nextInt ();
            switch (operation) {
                case 1:
                    Integer nextValue = scanner.nextInt ();
                    if (!values.containsKey (nextValue)) values.put (nextValue, 0);
                    values.put (nextValue, values.get (nextValue) + 1);
                    break;
                case 2:
                    if (values.isEmpty ()) break;
                    Integer key = values.firstKey ();
                    System.out.println (key);
                    if (values.get (key)-1 == 0) values.remove (key);
                    else {
                        values.put (key, values.get (key)-1);
                    }
                    break;
            }
        }
    }
}
