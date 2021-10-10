public class FourtyEight extends FiftyEightPatterns{
    //***** START OF PATTERN 48*****//
    public static void Pattern(int input){
    /*
            5
            4 5
            3 4 5
            2 3 4 5
            1 2 3 4 5*/

        System.out.println("***Printing the Pattern***");

        
        for(int a= input; a >= 1; a--){

            for(int b=a; b <=5; b++){
                System.out.print(b+ " ");
            }

            System.out.println(" ");
        }



    }}
//***** END OF PATTERN 48*****//

