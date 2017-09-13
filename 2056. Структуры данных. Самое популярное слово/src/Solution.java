import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<String, Integer>();
        int maxCount = 0;
        while (scanner.hasNext()) {
            String currentWord = scanner.next().toLowerCase();
            if (!map.containsKey(currentWord)) {
                map.put(currentWord, 0);
            }
            map.put(currentWord, map.get(currentWord) + 1);
            maxCount = Math.max(maxCount, map.get(currentWord));
        }
        for (String currentWord : map.keySet()) {
            if (map.get(currentWord) == maxCount) {
                System.out.println(currentWord);
            }
        }
    }
}