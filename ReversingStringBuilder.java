import java.util.Scanner;
public class ReversingStringBuilder{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String userInput = scanner.nextLine();
        String reversed = new StringBuilder(userInput).reverse().toString();
        System.out.println("Reversed string: " + reversed);
        scanner.close();
}
}
