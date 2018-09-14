public class a07_PrintMultTable {

    //print a multiplication table up to 12x12

    public static void main(String[] args) {
        //Let's use loops.
        //1  2  ...  11  12
        //2  4   .
        //3  6  ...  33  36
        //Let use i across, j down

        //HOLY SHIT I DID IT THE FIRST TRY!!!

        for (int j = 1; j <= 12; j++){
            for (int i = 1; i <= 12; i++){
                int k = i*j;
                System.out.print(k+ "  ");
            }
            System.out.println("\n");
        }
    }
}
