import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int duplicate = n;

        int sum = 0;

        while (n>0){
            int ld = n%10;

            sum = sum + (ld * ld * ld);

            n = n/10;
        }

        System.out.println(sum);

        if (duplicate == sum){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
