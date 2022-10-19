import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Intersections {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Crossings.txt"));
        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {
            int lines = scan.nextInt();
            ArrayList<Integer[]> intersections = new ArrayList<>();
            Line[] graph = new Line[lines];

            for (int j = 0; j < lines; j++) {
                graph[j] = new Line(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
            }

            for (Line line : graph) {
                for (Line value : graph) {
                    intersections.add(line.getIntersection(value));
                }
            }

            int[][] finalArray = intersections.stream().filter(Objects::nonNull).map(u -> Arrays.stream(u).mapToInt(a->a).toArray()).toArray(int[][]::new);
            Arrays.sort(finalArray, Comparator.<int[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1]));
            if (finalArray.length == 0) {
                System.out.println("No crossings");
            }
            System.out.println();
        }
    }
}
