package L6;
import java.util.Scanner;
public class oct33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter low  :");
        int low= sc.nextInt();

        System.out.print("Enter High:");
        int high = sc.nextInt();

        for (int n = low ; n<= high ; n++){
            if (n<= 1) continue;
            int count = 0;
            for (int div = 2 ; div * div <= n; div ++){
            if (n % div == 0){
                count++;
                break;
            }
        }
        if (count == 0){
            System.out.println(n);
        }
    }
}
}
