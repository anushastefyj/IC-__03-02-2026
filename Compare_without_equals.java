import java.util.Scanner;

public class Compare_without_equals {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st string: ");
        String str1 = sc.nextLine();  // Use different variable names for both inputs
        System.out.print("Enter the 2nd string: ");
        String str2 = sc.nextLine();
        sc.close();
        boolean equal = true;  
        if (str1.length() != str2.length()) {
            equal = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println("Are the strings equal? " + equal);
    }
}
