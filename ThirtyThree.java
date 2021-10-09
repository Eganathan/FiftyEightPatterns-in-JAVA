public class ThirtyThree extends FiftyEightPatterns{
    //***** START OF PATTERN 33*****//
    public static void Pattern_ThirtyThree(int input){
    /*
            5
            4 5 4
            3 4 5 4 3
            2 3 4 5 4 3 2
            1 2 3 4 5 4 3 2 1
            2 3 4 5 4 3 2
            3 4 5 4 3
            4 5 4
            5 */
        System.out.println(" Printing the Pattern Thirty Three with "+input +" rows or input! ");
            //First loop
            for(int a= input; a >= 1; a--){

                for(int b= a; b <= input; b++){
                    System.out.print(b+ " ");
                }

                for(int c= input-1; c >= a; c--){
                    System.out.print(c+ " ");
                }
                System.out.println(" ");
            }
        //Second Loop
        for(int a= 2; a <= input; a++){

            for(int b= a; b <= input ; b++){
                System.out.print(b+ " ");
            }

            for(int c= input-1; c >= a; c--){
                System.out.print(c+ " ");
            }
            System.out.println(" ");
        }}}


//***** END OF PATTERN 33*****//

