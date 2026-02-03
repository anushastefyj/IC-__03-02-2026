import java.util.Scanner;

public class ConcatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string:");
        String str2 = sc.nextLine();
        sc.close();
        
        String result = str1.concat(" ").concat(str2);
        System.out.println("Concatenated String: " + result);
    }
}
