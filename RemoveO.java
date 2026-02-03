import java.util.Scanner;

public class RemoveO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter substring to remove: ");
        String temp = scanner.nextLine();

        String del_string = input.replaceAll(temp, "");
        System.out.println("String after removing specified substring: " + del_string);

        scanner.close();
    }
}
