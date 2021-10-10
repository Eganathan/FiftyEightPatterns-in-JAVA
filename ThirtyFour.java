public class ThirtyFour extends FiftyEightPatterns{

    //***** START OF PATTERN 30*****//
    public static void Pattern(int input){
    /*
        1 2 3 4 5
        2 3 4 5 1
        3 4 5 1 2
        4 5 1 2 3
        5 1 2 3 4  */
        System.out.println(" Printing the Pattern Thirty Four with "+input +" as rows or input! ");

        for(int a = 1; a <= input; a++){
            int c = a;

            for(int b= a; b <= input; b++){

                System.out.print(c + " ");
                c++;
                if (c > 5){
                    c=1;
                }
               }


            System.out.println(" ");
            }

        }}
//***** END OF PATTERN 34*****//