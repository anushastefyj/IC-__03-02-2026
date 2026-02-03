import java.util.Scanner;
public class StringRotations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String str1=sc.nextLine();
        System.out.println("Enter the second string:");
        String str2=sc.nextLine();
        sc.close();
        
        if(str1.length()!=str2.length()&&(str1+str1).contains(str2)){
            System.out.println("Rotation.");
        }else{
            System.out.println("Not a rotation.");
        }
        
        
    }
}