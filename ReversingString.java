import java.util.Scanner;
public class ReversingString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string seperated with Comma: ");
        String input=sc.nextLine();
        sc.close();
        String[] word=input.split(",");
        StringBuilder result=new StringBuilder();
        for(int i=0;i<word.length;i++){
            String reversed=new StringBuilder(word[i]).reverse().toString();
            result.append(reversed);
            if(i<word.length-1){
                result.append(",");
            }
        }
        System.out.println("Reversed strings: "+result.toString());

    }
}
