import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int weight = scanner.nextInt ();
        int currentWeight = 0;
        int countOfLoadedItems = 0;
        for (int i = 0 ; i < n ; ++i) {
            int nextWeight = scanner.nextInt ();
            if (currentWeight + nextWeight <= weight) {
                currentWeight += nextWeight;
                ++countOfLoadedItems;
            }
        }
        System.out.println (countOfLoadedItems + " " + currentWeight);

    }
}
