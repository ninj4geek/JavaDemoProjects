import java.util.Scanner;

public class a08_PrintPrimes {

    public static void main(String[] args) {

        System.out.print("Please enter a maximum number to check\n" +
                "up to in order to find primes: ");

        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        //this will be our upper check limit

        for (int i = 2; i <= limit; i ++){
        //iterate through range, check prime each one
            if (isPrime(i)){
                System.out.println("Found prime "+i);
            }
        }
    }

    private static boolean isPrime(int n) {

        for (int i = 2; i < n; i++){
            if ((n % i) == 0){
                return false;
            }
        }
        return true;
    }
}


