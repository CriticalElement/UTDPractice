import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class ListOfConquests {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Don.txt"));
        int total = scan.nextInt();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < total; i++) {
            String country = scan.next();
            map.putIfAbsent(country, 0);
            map.put(country, map.get(country) + 1);
            scan.nextLine(); // idc about the rest
        }

        TreeMap<String, Integer> sorted = new TreeMap<>(map);
        sorted.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
