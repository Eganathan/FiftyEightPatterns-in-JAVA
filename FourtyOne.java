public class FourtyOne extends FiftyEightPatterns{
        //***** START OF PATTERN 41*****//
        public static void Pattern(int input){
    /*
        543212345
        5432 2345
        543   345
        54     45
        5       5*/

            System.out.println(" Printing the Pattern Fourty One with "+input +" as rows or input! ");

            for(int a= 1; a <= input; a++){
                for(int b=input; b >= a; b--){
                    System.out.print(b);
                }

                for (int s =a*2; s > 2; s--){
                    System.out.print(" ");
                }


                for(int c=a;c <= input; c++){
                    if (c!=1){

                        System.out.print(c);
                    }
                }

                System.out.println(" ");
            }


        }}
//***** END OF PATTERN 41*****//

