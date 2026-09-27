import java.util.Scanner;
class septseventwo {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int number;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        char choice;

        do{
        System.out.print("Enter your number: ");
        number=scn.nextInt();
        if (number > max){
            max=number;

        }if(number < min){
            min=number;
        }
        System.out.println("Do you want to coninue y/n");
        choice=scn.next().charAt(0);

    }while(choice=='y' || choice == 'Y');

    System.out.println("Largest number:" + max);
    System.out.println("Smallest number:" + min);

    
    }
    
}
