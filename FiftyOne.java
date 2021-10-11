public class FiftyOne extends FiftyEightPatterns{
    //***** START OF PATTERN 50*****//
    public static void Pattern(int input){
    /*  1
        2 3 2
        4 5 6 5 4
        7 8 9 10 9 8 7
        11 12 13 14 15 14 13 12 11*/

        System.out.println("***Printing the Pattern***");

        int temp =1;
        for(int p = 1; p <= input; p++){
            for(int q=1; q <= p; q++){
                System.out.print(temp +" ");
                temp++;
            }

            int temp2 = temp-1;

            for(int r=2; r <= p; r++){
                System.out.print(--temp2 + " ");
                temp2--;
            }

            System.out.println(" ");
        }

    }
}
//***** END OF PATTERN 50*****//

