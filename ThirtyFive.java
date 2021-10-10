public class ThirtyFive extends FiftyEightPatterns{

        //***** START OF PATTERN 35*****//
        public static void Pattern(int input){
    /*
        1 2 3 4 5
        2 3 4 5 1
        3 4 5 2 1
        4 5 3 2 1
        5 4 3 2 1  */
            System.out.println(" Printing the Pattern Thirty Five with "+input +" as rows or input! ");

            for(int a= 1; a <= input; a++){
            int temp = 0;
                for(int b= a; b <= input; b++){
                    System.out.print(b + " ");
                    temp= a-1;
                    if( b== 5){
                        for(int c= temp; c >=1; c--){
                            System.out.print(c + " ");
                        }

                    }
                }

                System.out.println(" ");
            }



        }}
//***** END OF PATTERN 35*****//

