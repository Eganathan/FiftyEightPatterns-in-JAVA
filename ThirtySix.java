public class ThirtySix extends  FiftyEightPatterns{

        //***** START OF PATTERN 36*****//
        public static void Pattern(int input){
    /*
        1 3 5 7 9
        3 5 7 9 1
        5 7 9 1 3
        7 9 1 3 5
        9 1 3 5 7  */
            System.out.println(" Printing the Pattern Thirty Five with "+input +" as rows or input! ");

            for (int a = 1; a <= input; a++)
            {
                int b = (a * 2) - 1;

                for (int c = 1; c <= input; c++)
                {
                    System.out.print(b + " ");
                    b += 2;
                    if (b > (input * 2) - 1)
                        b = 1;
                }
                System.out.println();
            }

        }}
//***** END OF PATTERN 36*****//

