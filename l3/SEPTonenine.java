import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        
        System.out.print("Enter a string");
        String str=scn.nextLine();
        System.out.println("The String is "+ str);

        System.out.print("Enter an integer number:");
        int num=scn.nextInt();
        System.out.print("  Number is"+ num);

        System.out.print("  Enter a floating number");
        float fnum=scn.nextInt();
        System.out.print("   The floating number is"+ fnum);

        scn.close();
    }
    
}