import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TheTrainSwapper {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Train.txt"));
        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {
            int totalCars = scan.nextInt();
            int[] cars = new int[totalCars];
            for (int j = 0; j < totalCars; j++) {
                cars[j] = scan.nextInt();
            }

            int[] sorted = cars.clone();
            int steps = 0;
            Arrays.sort(cars);

            while (!Arrays.equals(sorted, cars)) {
                for (int it = 0; it < sorted.length - 1; it++) {
                    if (sorted[it] > sorted[it + 1]) {
                        int first = sorted[it];
                        sorted[it] = sorted[it + 1];
                        sorted[it + 1] = first;
                        steps++;
                    }
                }
            }

            System.out.println("Optimal train swapping takes " + steps + " swaps.");
        }
    }
}
