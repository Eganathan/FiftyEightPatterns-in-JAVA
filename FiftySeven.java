public class FiftySeven extends FiftyEightPatterns{
    //***** START OF PATTERN 57*****//
    public static void Pattern(int input){
    /*
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
*/

        System.out.println("***Printing the Pattern***");

        for (int i = 0; i < input; i++)
        {
            int num = 1;
            for (int j = 0; j <= i; j++)
            {
                if(i ==0 || j ==0)
                    num = 1;
                else
                    num = num * (i - j + 1)/ j;
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }}
//***** END OF PATTERN 57*****//

