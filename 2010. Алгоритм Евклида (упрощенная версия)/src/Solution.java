import javafx.util.Pair;

import java.util.Scanner;

public class Solution {
    public static Pair <Integer, Integer> EuclideanAlgorithm (int a, int b) {
        int result = 0;
        int countOfIterations = 0;
        while (a > 0 && b > 0) {
            if (a > b) a -= b;
            else b -= a;
            ++countOfIterations;
        }
        result = a > 0 ? a : b;
        return new Pair <> (countOfIterations, result);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = scanner.nextInt ();
        int b = scanner.nextInt ();
        Pair <Integer, Integer> results = EuclideanAlgorithm (a, b);
        System.out.println (results.getKey () + " " + results.getValue ());

    }
}
