public class CountDigits {
    public static void main(String args[]){
        String str="anusha3249841654hkjhjFJKSD545";
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
        }
        System.out.println("Number of digits in the string: "+count);
    }
}