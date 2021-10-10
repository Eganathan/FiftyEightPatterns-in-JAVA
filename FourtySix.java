public class FourtySix extends FiftyEightPatterns{
    //***** START OF PATTERN 46*****//
    public static void Pattern(int input){
    /*
        1
        2 1 2
        3 2 1 2 3
        4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
        4 3 2 1 2 3 4
        3 2 1 2 3
        2 1 2
        1*/

        System.out.println("***Printing the Pattern***");

        //First Part
        for(int a= 1; a <= input; a++){
            for(int b=a; b >= 1; b--){
                System.out.print(b + " ");
            }
            for(int c=2; c <= a; c++){
                System.out.print(c + " ");
            }

            System.out.println(" ");
        }
        //Second Part
        for(int d = input-1; d >= 1; d--){

            for(int e= d; e >= 1; e--){
                System.out.print(e + " ");
            }

            for(int f=2; f <= d; f++){
                System.out.print(f + " ");
            }


            System.out.println(" ");
        }



    }}
//***** END OF PATTERN 46*****//

