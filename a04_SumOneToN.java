import java.util.Scanner;

public class a04_SumOneToN {

    public static void main(String[] args) {
        System.out.print("We're going to add up " +
                "numbers from \"1\" to your input.\n" +
                "Please enter a number to sum up to: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Your sum is "+(SumToN(num)));
    }

    public static int SumToN(int N){
        int sum = 0;
        for (int i = 1; i <= N; i++){
            sum += i;
        }
        return sum;
    }
}
