import java.util.Scanner;

public class a06_SumOrProductToN {

    public static void main(String[] args) {

        System.out.print("We're going to need a number\n" +
                "to either add up to or " +
                "multiply up to.\nPlease enter your number: ");
        Scanner input = new Scanner (System.in);
        long number = input.nextLong();

        if (number < 1){
            System.out.println("Invalid input\n\n");
            System.exit(0);
        }

        System.out.println("Thank you. Now please specify if " +
                "you want to \nadd the series or " +
                "multiply the series: ");
        String option = input.next();

        switch(option.toLowerCase()){
            case "add": case "sum":
                System.out.print("We added the numbers " +
                        "from \"1\" to \""+number+
                        "\". \nHere is your result: ");
                System.out.println(Sum(number));
                break;
            case "multiply": case "product":
                System.out.print("We multiplied the numbers" +
                        " from \"1\" to \""+number+
                        "\". \nHere is your result: ");
                System.out.println(Product(number));

                break;
            default:
                System.out.println("Invalid input\n\n");
                System.exit(0);
        }
    }

    public static long Product(long x){
        long product = 1;
        for (long i = 1; i <= x; i++){
            product *= i;
        }
        return product;
    }

    public static long Sum (long x){
        int sum = 0;
        for (int i = 1; i <= x; i++){
            sum += i;
        }
        return sum;
    }
}
