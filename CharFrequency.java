import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter a character to count: ");
        char target = scanner.next().charAt(0);

        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + " in the string: " + count);

        scanner.close();
    }
}


