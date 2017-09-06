import java.util.Scanner;

public class Solution {
    public static boolean IsOrdinal(int n){
        boolean result = true;
        for (int i=2; i<=Math.sqrt (n); ++i) {
            result = n % i != 0;
            if (!result) break;
        }
        return result;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        for (int i=2; i<= n; ++i) {
            if (IsOrdinal (i)) {
                System.out.println (i);
            }
        }
    }
}
