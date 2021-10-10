public class ThirtyEight extends FiftyEightPatterns{

        //***** START OF PATTERN 38*****//
        public static void Pattern(int input){
    /*
        1        1
        12      21
        123    321
        1234  4321
        1234554321 */

            System.out.println(" Printing the Pattern Thirty Eight with "+input +" as rows or input! ");

            for (int a = 1; a <= input; a++)
            {
                for(int b= 1; b <= a; b++){
                    System.out.print(b);
                }

                for (int d= a*2 ; d < input*2; d++)
                {
                    System.out.print(" ");
                }

                for(int c= a; c >= 1; c--){
                    System.out.print(c);
                }

                System.out.println();
            }

        }}
//***** END OF PATTERN 38*****//

