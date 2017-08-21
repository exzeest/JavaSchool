import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int currentValue = scanner.nextInt();
        int occurrences = 1;
        int value = currentValue;
        int mostOccurrences = occurrences;
        for (int i = 1 ; i < n ; ++i) {
            int nextValue = scanner.nextInt();
            if (nextValue > currentValue) {
                if (occurrences > mostOccurrences) {
                    mostOccurrences = occurrences;
                    value = currentValue;
                }
                currentValue = nextValue;
                occurrences = 0;
            }
            ++occurrences;
        }
        if (occurrences > mostOccurrences) {
            mostOccurrences = occurrences;
            value = currentValue;
        }
        System.out.println(value + " " + mostOccurrences);
    }
}
