import java.util.Scanner;

public class StringwithoutLength {
    public static void main(String[] args) {
        int count = 0;

        System.out.print("Enter a string: ");
        try (Scanner scanner = new Scanner(System.in)) {
            char[] chars = scanner.nextLine().toCharArray();

            for (int i = 0; i < chars.length; i++) {
                count++;
            }
        }

        System.out.println("Length of the string: " + count);
    }
}
