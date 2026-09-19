import java.util.Scanner;
class Main{
    public static void main(String[] args ){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enetr a number:");
        int num=scn.nextInt();
        if(num>10){
            System.out.println("Yes I'm Greater");
        } else{
            System.out.println("Sorry I'm less");
        }
        scn.close();

    }
}
 