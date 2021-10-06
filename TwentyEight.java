public class TwentyEight extends FiftyEightPatterns{

    //***** START OF PATTERN 28*****//
    public static void Pattern_TwentyEight(int input){
    /*
        1
        2 4
        3 6 9
        4 8 12 16
        5 10 15
        6 12
        7 */
        System.out.println(" Printing the Pattern Twenty Seven with "+input +" as rows or input! ");

        int temp =1;
        //First Loop
        for(int a=1; a <= (input/2)+1; a++){

            for(int b =a; b >= a; b--){

                for(int c=1; c <= b; c++){
                    System.out.print(b*c +" ");
                }
            }
            temp++;
        System.out.println(" ");
        }
        //Second Loop
        for(int i=1; i<=input/2; i++)
        {
            for(int j=1;j<=input/2+1-i;j++)
            {
                System.out.print(temp*j+" ");
            }
            System.out.println();
            temp++;
        }


    }
}
//***** END OF PATTERN 28*****//
