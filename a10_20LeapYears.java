public class a10_20LeapYears {

    public static void main(String[] args) {
//        //get current year
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter the current year: ");
//        int currentYear = input.nextInt();
//        System.out.print("Thank you. Please enter your range: ");
//        int range = input.nextInt();
        int currentYear = 1899;
        int count = 0;

        while (count <= 25) {
            if (isLeapYear(currentYear)) {
                System.out.println(currentYear + " is a leap year");
                count++;

            }
            currentYear++;
        }
    }



    private static boolean isLeapYear(int year){
        if (((year % 4 == 0) || (year % 400 == 0)) && (year % 100 != 0)){
            //want every 4th year and 400th, AND NOT every 100th (just 400th)
            return true;
        }
        return false;
    }
}
