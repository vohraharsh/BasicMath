import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = scn.nextInt();

        System.out.println("You entered: " + n);

        scn.close();

        int count = 0;

        while (n > 0){

            int lastDigit = n % 10;

            System.out.println(lastDigit);

            count++; // Increment count

            n = n / 10;

            System.out.println(n);
        }

        System.out.println("Counter = " + count);
    }
}
