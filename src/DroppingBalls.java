import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DroppingBalls {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Balls.txt"));
        int totalIterations = scan.nextInt();
        int[] restingPlaces = new int[totalIterations];

        for (int i = 0; i < totalIterations; i++) {
            int depth = scan.nextInt();
            int ballsDropped = scan.nextInt();
            Node tree = new Node(1, 1, depth);
            int restingPlace = 1;
            for (int it = 0; it < ballsDropped; it++) {
                restingPlace = tree.dropBall();
            }
            restingPlaces[i] = restingPlace;
        }

        for (int place : restingPlaces) {
            System.out.println(place);
        }
    }
}
