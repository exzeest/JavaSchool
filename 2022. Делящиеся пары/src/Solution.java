import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int[] values = new int[n];
        int countOfPairs = 0;
        for (int i = 0; i < n; ++i) {
            values[i] = scanner.nextInt ();
        }
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (values[i] % values[j] == 0)
                    ++countOfPairs;
                if (values[j] % values[i] == 0)
                    ++countOfPairs;
            }
        }
        System.out.println (countOfPairs);
    }
}
