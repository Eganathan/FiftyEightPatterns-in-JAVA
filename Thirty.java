public class Thirty extends FiftyEightPatterns{
    //***** START OF PATTERN 30*****//
    public static void Pattern_Thirty(int input){
    /*
        1 10 11 20 21
        2 9  12 19 22
        3 8  13 18 23
        4 7  14 17 24
        5 6  15 16 25  */
        System.out.println(" Printing the Pattern Thirty with "+input +" as rows or input! ");


        int rows = input;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if (j % 2 == 0)
                    System.out.print((rows * (j)) + i + 1 + " ");
                else
                    System.out.print((rows * (j + 1)) - i + " ");
            }
            System.out.print("\n");
        }}}








//***** END OF PATTERN 30*****//

