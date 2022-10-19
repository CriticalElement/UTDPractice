import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AlmostPalindromes {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("Pals.txt"));
        int total = scan.nextInt();

        for (int i = 0; i < total; i++) {
            String word = scan.next();
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                System.out.println("The string is already a palindrome");
            }
            else {
                boolean worked = false;
                for (int c = 0; c < word.length(); c++) {
                    String newWord = new StringBuilder(word).deleteCharAt(c).toString();
                    reversed = new StringBuilder(newWord).reverse().toString();
                    if (newWord.equals(reversed)) {
                        worked = true;
                        System.out.println("A palindrome can be formed by deleting the letter in position " + (c + 1));
                        break;
                    }
                }
                if (!worked) {
                    System.out.println("A palindrome cannot be formed by deleting a single letter");
                }
            }
        }
    }
}
