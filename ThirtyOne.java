public class ThirtyOne extends FiftyEightPatterns{
        //***** START OF PATTERN 31*****//
        public static void Pattern_ThirtyOne(int input){
    /*
        5 5 5 5 5
        5 4 4 4 4
        5 4 3 3 3
        5 4 3 2 2
        5 4 3 2 1  */
            System.out.println(" Printing the Pattern Thirty One with "+input +" rows or input! ");
            int temp = 1;

            for (int a = input; a >= 1; a--)
            {
                for (int b = input ; b >= a; b--)
                {
                    System.out.print(b + " ");
                    temp = b;
                }
                for (int c = input - a+1; c < input; c++)
                {
                    System.out.print(temp + " ");
                }
                System.out.println();
            }}}












//***** END OF PATTERN 31*****//

