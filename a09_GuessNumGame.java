import java.lang.*;
import java.util.Scanner;
// Write a guessing game where the user
// has to guess a secret number. After
// every guess the program tells the user
// whether their number was too large or
// too small. At the end the number of tries
// needed should be printed. It counts only
// as one try if they input the same number
// multiple times consecutively.

public class a09_GuessNumGame {
    public static void main(String[] args) {
        //generate a random number between 1 and 50
        double randomNum0 = (Math.random()*50) + 1;
        int randomNum = (int)randomNum0;

        System.out.print("Welcome to the guessing game! Guess the number between 1 and 50: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        int count = 0;
        while (guess != randomNum) {
            count++;
            if (count == 5){
                System.out.println("Too many guesses! YOU LOSE!");
                System.exit(0);
            }

            if (guess < randomNum) {
                System.out.print("Go bigger! ");
            } else {
                System.out.print("...smaller. ");
            }
            guess = input.nextInt();
            }
        System.out.println("CONGRATULATIONS WINNER!!!");
    }
}

