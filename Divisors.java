import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int count = 0;

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i);
                count++;
            }
        }

        System.out.println(count + ": total number of factors/divisors");
    }
}
