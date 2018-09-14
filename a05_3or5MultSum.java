import java.util.Scanner;

public class a05_3or5MultSum {

    public static void main(String[] args) {
        System.out.print("We're going to add up " +
                "numbers from \"1\" to your input, \n" +
                "for numbers divisible by 3 or 5 only. " +
                "\nPlease enter a number to sum up to: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Your sum is "+(mult3or5Sum(num)));
    }


    public static int mult3or5Sum(int N) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {

            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            } else {
                continue;
            }
        }
    return sum;
    }
}
