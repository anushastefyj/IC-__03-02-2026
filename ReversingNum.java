import java.util.Scanner;
public class ReversingNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a num seperated with  ");
        int num = sc.nextInt();
        String input = String.valueOf(num);
        String rev = "";
        for(int i=input.length()-1;i>=0;i--){
            rev += input.charAt(i);
        }
        System.out.println(rev);
        sc.close();
        
    }
}
