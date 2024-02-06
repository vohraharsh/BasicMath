import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int rn = 0;

    while (n>0){

        int ld = n%10;

        rn = (rn * 10) + ld;

        /*
         * the logic is here the first we have created reversenumber = rn = 0; (it will always be zero)
         *  next in lastdigit (ld) = using n%10 we get the last digit
         * then that last didgit is stored at first using the combination rn * 10 + ld 
         * => ex if last digit is 2 then 0*10 = 0 + 2 => 2 this is our first iteration
         * and then it will continue
         */

        n = n/10;
    }

    System.out.println(rn);
    }
}
