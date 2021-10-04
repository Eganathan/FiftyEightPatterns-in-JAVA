public class TwentySix extends FiftyEightPatterns{

    //***** START OF PATTERN 26*****//
    public static void Pattern_TwentySix(int input){
    /*
        5 5 5 5 5
        4 5 5 5 5
        3 4 5 5 5
        2 3 4 5 5
        1 2 3 4 5  */
        System.out.println(" Printing the Pattern Twenty Six with "+input +" as rows or input! ");

        for(int a= input; a >= 1 ; a--){

            for(int b = a;b< input ; b++){
                //a = 4 b= 4, a=3 b= 3,4,5.... till b is less than input
                System.out.print(b+ " ");
            }
            for(int c = input-a; c < input ; c++){
                //input-a = c = 1, a=3 c= 1,2.. till c is less than input
                System.out.print(input+ " ");
            }
            System.out.println( " ");
        }

    }//***** END OF PATTERN 26*****//
}
