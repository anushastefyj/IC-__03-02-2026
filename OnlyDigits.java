import java.util.Scanner;
public class OnlyDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        sc.close();
        boolean isDigitonly=str.matches("[0-9]+");
        System.out.println("String contains only digits: "+isDigitonly);
    }
}
