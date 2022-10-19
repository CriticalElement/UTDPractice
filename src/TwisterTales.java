import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwisterTales {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Twister.txt"));
        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {
            int initial = scan.nextInt();
            int theta = scan.nextInt();
            int finalAngle = (initial - theta % 360);
            if (finalAngle < 0) {
                finalAngle = 360 - Math.abs(finalAngle);
            }
            System.out.println(finalAngle);
        }
    }
}
