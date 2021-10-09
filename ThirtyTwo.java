public class ThirtyTwo extends FiftyEightPatterns{
    //***** START OF PATTERN 32*****//
    public static void Pattern_ThirtyTwo(int input){
    /*
        1
        1 2
        1 2 3
        1 2 3 5
        1 2 3 5 8  */
        System.out.println(" Printing the Pattern Thirty Two with "+input +" rows or input! ");

        for (int a= 1; a <= input; a++){

            int x= 0;
            int y= 1;

            for(int b=1; b <=a ; b++){

                int z = x+y;
                System.out.print(z + " ");
                x =y;
                y=z;
            }
          System.out.println("");
        }


        }}


//***** END OF PATTERN 32*****//

