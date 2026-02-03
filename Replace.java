import java.util.Scanner;
public class Replace {
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String replaced = str.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("After Replacement:" + replaced);
        sc.close();
    }
}
