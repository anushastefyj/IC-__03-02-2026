import java.util.Scanner;
public class OddPositions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        sc.close();
        System.out.println("Characters at odd positions:");
        for (int i = 1; i < str.length(); i += 2) {
        System.out.print(str.charAt(i) + " ");
        }

    }
}

