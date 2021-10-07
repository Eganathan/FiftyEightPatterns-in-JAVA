public class TwentySeven extends FiftyEightPatterns{
    //***** START OF PATTERN 27*****//
    public static void Pattern_TwentySeven(int input){
    /*
        1
        2 6
        3 7 10
        4 8 11 13
        5 9 12 14 15  */
        System.out.println(" Printing the Pattern Twenty Seven with "+input +" as rows or input! ");

            for(int a= 1; a <= input; a++){
                int temp =1;

                for(int b = a; b >= 1; b--){
                    System.out.print(b+ " ");
                    temp +=1;
                }

                System.out.println( " ");
            }

    }//***** END OF PATTERN 27*****//
}
