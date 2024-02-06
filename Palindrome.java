import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int duplicate = n;

        int rn = 0;

        while (n>0){
            int ld = n%10;

            rn = (rn * 10) + ld;

            n = n/10;
        }

        System.out.println(rn);

        if(duplicate == rn){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
