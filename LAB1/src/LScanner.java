import java.util.Scanner;

public class LScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String word = scanner.next();
            System.out.println("Считанное слово: " + word);
        }
        scanner.close();
    }
}