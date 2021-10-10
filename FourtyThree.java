public class FourtyThree extends FiftyEightPatterns{
    //***** START OF PATTERN 43*****//
    public static void Pattern(int input){
    /*
        1
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1
        1 2 3 4 3 2 1
        1 2 3 2 1
        1 2 1
        1*/

        System.out.println(" Printing the Pattern Fourty Three with "+input +" as rows or input! ");

        //First Part of the loop
        for(int a= 1; a <= input; a++){

            for(int b= 1; b <= a; b++){
                System.out.print(b + " ");
            }
            for(int c= a-1; c >=1; c--){
                System.out.print(c + " ");
            }
            System.out.println("");
        }
        //Second Part of the loop
        for(int a= input-1; a >= 1; a--){

            for(int b= 1; b <= a; b++){
                System.out.print(b + " ");
            }
            for(int c= a-1; c >=1; c--){
                System.out.print(c + " ");
            }
            System.out.println("");
        }
    }}
//***** END OF PATTERN 43*****//

