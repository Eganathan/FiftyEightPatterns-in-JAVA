public class ThirtySeven extends FiftyEightPatterns{

        //***** START OF PATTERN 37*****//
        public static void Pattern(int input){
    /*
        1 3 5 7 9
        3 5 7 9 1
        5 7 9 3 1
        7 9 5 3 1
        9 7 5 3 1  */
            System.out.println(" Printing the Pattern Thirty Seven with "+input +" as rows or input! ");

            for (int i = 1; i <= input; i++)
            {
                int j = (i * 2) - 1;

                for (int k = i; k <= input; k++)
                {
                    System.out.print(j + " ");
                    j += 2;
                }
                for (int l = (i * 2) - 3; l >= 1; l-=2)
                {
                    System.out.print(l + " ");
                }
                System.out.println();
            }

        }}
//***** END OF PATTERN 37*****//



