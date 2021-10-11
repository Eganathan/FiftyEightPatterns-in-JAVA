public class FiftyEight extends FiftyEightPatterns{
    //***** START OF PATTERN 58*****//
    public static void Pattern(int input){
    /*
    1
    1 1
    1 1 2
    1 1 2 3
    1 1 2 3 5
    1 1 2 3 5 8
*/

        System.out.println("***Printing the Pattern***");

        for (int i = 0; i <= input; i++)
        {
            int x = 0;
            int y = 1;
            System.out.print(y+" ");
            for (int j = 0; j < i; j++)
            {
                int z = x + y;
                System.out.print(z + " ");
                x = y;
                y = z;
            }
            System.out.println();
        }


    }}
//***** END OF PATTERN 58*****//

