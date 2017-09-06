import java.util.Scanner;

public class Solution {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner (System.in);
        int a1 = scanner.nextInt ();
        int b1 = scanner.nextInt ();
        int a2 = scanner.nextInt ();
        int b2 = scanner.nextInt ();
        String result;
        if (((a1 + a2 == b1) && (b1 == b2)) ||
                ((a1 + b2 == b1) && (b1 == a2)) ||
                ((b1 + a2 == a1) && (a1 == b2)) ||
                ((b1 + b2 == a1) && (a1 == a2))) result = "YES";
        else result = "NO";
        System.out.println (result);
    }
}
