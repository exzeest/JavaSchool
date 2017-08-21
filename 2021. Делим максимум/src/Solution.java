import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; ++i) {
            values[i] = scanner.nextInt();
        }
        for (int j = 0; j < 2; ++j) {
            int max = values[0];
            ArrayList <Integer> maxValueNumbers = new ArrayList <>();
            maxValueNumbers.add(0);
            for (int i = 1; i < n; ++i) {
                if (values[i] == max) {
                    maxValueNumbers.add(i);
                }
                if (values[i] > max) {
                    max = values[i];
                    maxValueNumbers.clear();
                    maxValueNumbers.add(i);
                }
            }
            for (int i = 0; i < maxValueNumbers.size(); ++i) {
                values[maxValueNumbers.get(i)] /= 2;
            }
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(values[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }
}
