public class FiftySix extends FiftyEightPatterns{
    //***** START OF PATTERN 56*****//
    public static void Pattern(int input){
    /*
    1
    1 4
    1 8 27
    1 16 81 256
*/

        System.out.println("***Printing the Pattern***");

        for(int a= 1; a <= input; a++){

            for(int b=1; b <= a; b++){
                System.out.print((int)Math.pow(a,b) + " ");
            }

            System.out.println(" ");
        }


}}
//***** END OF PATTERN 56*****//

