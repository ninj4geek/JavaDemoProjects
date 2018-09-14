import java.util.Scanner;

public class a02_GetNamePrintName {

    public static void main(String[] args) {

        //need to get a name from the user
        //then print it out to the screen

        System.out.print("\nPlease enter your name: ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("\nYour name is "+name);

    }
}
