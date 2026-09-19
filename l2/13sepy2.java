

public class Main{
    public static void main(String[] args ) {
        int a=10;
        int b=5;
        
        System.out.println("===========Guess the answers=====");
        System.out.println("Urinary Operator"+(a++));
        System.out.println("Urinary Operator"+(++b));
        System.out.println("1+2"+1+2);
        System.out.println(1+2 +"3");
        int increment=++a* b++;
        System.out.println("Terinary Operator");
        int largestNumber=(a>b)?a:b;
        System.out.println("Lrgets of 2 numbers " + largestNumber);



        
    }

}
