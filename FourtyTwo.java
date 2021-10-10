public class FourtyTwo extends FiftyEightPatterns{
    //***** START OF PATTERN 42*****//
    public static void Pattern(int input){
    /*
        123454321
        1234 4321
        123   321
        12     21
        1       1*/

        System.out.println(" Printing the Pattern Fourty Two with "+input +" as rows or input! ");

        for(int a= input; a >=1 ; a--){

            for(int b= 1; b <= a; b++){
                System.out.print(b);
            }

            for (int s= a*2 ; s < input*2-1; s++)
            {
                System.out.print(" ");
            }



            for(int c= a; c >= 1; c--){
                if(c!=5){
                    System.out.print(c);
                }
            }


            System.out.println(" ");
        }


    }}
//***** END OF PATTERN 42*****//

