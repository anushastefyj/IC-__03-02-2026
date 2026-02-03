import java.util.Scanner;
public class StartandEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");    
        String str=sc.nextLine();
        sc.close();
        if(str.charAt(0)==str.charAt(str.length()-1)){
            System.out.println("The first and last characters are the same.");
        }else{
            System.out.println("The first and last characters are not the same.");
        }
    }
}
