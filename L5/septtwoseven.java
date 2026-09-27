import java.util.Scanner;
public class septtwoseven {
    public static void main (String[] args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a number(n):");

        int n = scn.nextInt();
        int sum=0;

        for(int i=1; i <=n ;i++){
            sum +=1;
        }
        System.out.println("Sum till " +n+ " is " +sum + ".");
    }
}
