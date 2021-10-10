public class FortyNine extends FiftyEightPatterns{
    //***** START OF PATTERN 49*****//
    public static void Pattern(int input){
    /*
            2
            3 5
            7 11 13
            17 19 23 29
            31 37 41 43 47*/

        System.out.println("***Printing the Pattern***");


        int temp = 2;

        for (int i = 1; i <= input; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                while (!isPrime(temp))
                {
                    temp++;
                }
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num)
    {
        boolean flag = false;
        for (int k = 2; k <= num / 2; k++)
        {

            if (num % k == 0)
            {
                flag = true;
                break;
            }
        }
        if (flag)
            return false;
        return true;
    }
}
//***** END OF PATTERN 49*****//

