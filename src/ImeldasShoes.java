import java.util.*;
import java.io.*;


public class ImeldasShoes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Shoes.txt"));
        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {
            int totalShoes = scan.nextInt();
            HashMap<Integer, Integer> shoes = new HashMap<>();

            for (int j = 0; j < totalShoes; j++) {
                shoes.put(scan.nextInt(), scan.nextInt());
            }

            HashMap<Integer, Integer> sorted = new HashMap<>(shoes);
            int numSwaps = 0;
            for (Map.Entry<Integer, Integer> entry : shoes.entrySet()) {
                Integer k = entry.getKey();
                Integer v = entry.getValue();
                numSwaps += swaps(k, v, sorted);
            }

            System.out.println(numSwaps);
        }
    }

    private static int swaps(int k, int v, HashMap<Integer, Integer> map) {
        if (k != v) {
            if (map.get(v) != v) {
                int oldKey = map.get(v);
                map.put(v, v);
                map.put(k, oldKey);
                return 1 + swaps(oldKey, map.get(oldKey), map);
            }
        }
        return 0;
    }
}