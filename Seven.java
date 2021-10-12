public class Seven extends FiftyEightPatterns{

    //***** START OF PATTERN 07*****//
    public static void Pattern(int input){
    /*
        5 4 3 2 1
        5 4 3 2
        5 4 3
        5 4
        5 */
        System.out.println("**Printing the Pattern**");

        int temp =1;
        //First Loop
        for(int a=input; a >= 1; a-- ){

            temp =input;
            for(int b=1; b <= a; b++){
                System.out.print(temp-- + " ");
            }


            System.out.println();
        }


    }
}//***** END OF PATTERN 07*****//
