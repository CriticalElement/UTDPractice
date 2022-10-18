import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheEggSeller {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Eggs.txt"));
        int total = scan.nextInt();
        int[] finalValues = new int[total];

        for (int i = 0; i < total; i++) {
            int customers = scan.nextInt();
            int initial = 0;
            for (int j = 0; j < customers; j++) {
                initial += Math.pow(2, j);
            }
            finalValues[i] = initial;
        }

        for (int val : finalValues) {
            System.out.println(val);
        }
    }
}
