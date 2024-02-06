import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int count = 0;

        for(int i=1; i*i <= n; i++){
            if(n%i == 0){
                count++;
            }
            if((n/i) != i){
                count++;
            }
        }

        System.out.println(count);

        if(count == 2){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
