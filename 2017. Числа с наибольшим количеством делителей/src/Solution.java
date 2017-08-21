import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static int CountOfDeviders (int n) {
        int result = 1;
        for (int i = 1 ; i < Math.sqrt (n) ; ++i) {
            if (n % i == 0) ++result;
        }
        return result;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt ();
        int b = scanner.nextInt ();
        int maxCountOfDeviders = 0;
        ArrayList <Integer> numbers = new ArrayList <> ();
        for (int i = a ; i <= b ; i++) {
            int countOfDeviders = CountOfDeviders (i);
            if (maxCountOfDeviders == countOfDeviders) {
                numbers.add (i);
            }
            if (maxCountOfDeviders < countOfDeviders) {
                maxCountOfDeviders = countOfDeviders;
                numbers.clear ();
                numbers.add (i);
            }
        }
        System.out.println (numbers.size ());
        for (int i = 0 ; i < numbers.size () ; ++i) {
            System.out.print (numbers.get (i));
            if (i < numbers.size () - 1)
                System.out.print (",");
        }

    }
}