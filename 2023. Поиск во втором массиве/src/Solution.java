import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int[] arr1 = new int[n];
        ArrayList <Integer> arr2 = new ArrayList <> ();
        for (int i = 0 ; i < n ; ++i) {
            arr1[i] = scanner.nextInt ();
        }
        int m = scanner.nextInt ();
        for (int i = 0 ; i < m ; ++i) {
            arr2.add (scanner.nextInt ());
        }
        ArrayList <Integer> arr3 = new ArrayList <> ();
        for (int i = 0 ; i < n ; ++i) {
            if (arr2.contains (arr1[i])) {
                arr3.add (arr1[i]);
            }
        }
        System.out.println (arr3.size ());
        for (int i = 0 ; i < arr3.size () ; ++i) {
            System.out.print (arr3.get (i));
            if (i < arr3.size () - 1) System.out.print (" ");
        }
    }
}
