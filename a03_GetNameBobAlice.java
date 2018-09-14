import java.util.Scanner;

public class a03_GetNameBobAlice {
    public static void main(String[] args) {
        //need to get a name from the user
        //then print it out to the screen
        System.out.print("\nPlease enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        switch (name.toLowerCase()){
            case "bob":
                System.out.println("Hello Bob.");
                break;
            case "alice":
                System.out.println("Hello Alice");
                break;

                default:
                    System.out.println("Unrecognized User");
                    break;
        }
    }
}


