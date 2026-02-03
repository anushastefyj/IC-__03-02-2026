public class Countcase {
    public static void main(String[] args) {
        String str="java programming 2026 batch";
        int upper=0,lower=0;
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch))upper++;
            else if(Character.isLowerCase(ch))lower++;
        }System.out.println("uppercase:"+upper);
        System.out.println("lowercase:"+lower);
    }
}