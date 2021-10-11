public class FiftyFive extends FiftyEightPatterns{
    //***** START OF PATTERN 55*****//
    public static void Pattern(int input){
    /*
    1
   3 2
  4 5 6
 10 9 8 7
11 12 13 14 15
*/

        System.out.println("***Printing the Pattern***");

        int cRow = 1;
        int counter = 1;
        for(int a= 1; a <= input; a++){

           //Spacing

            //System.out.print(counter+ " ");
            //counter++;

            if(a%2 == 0){
                int reverse = counter+cRow-1;

                for(int x=0; x <  a; x++){
                    System.out.print(reverse-- + " ");
                    counter++;
                }
            }else{
                for(int y= 1; y <= a; y++){
                    System.out.print(counter +" ");
                    counter++;
                }
            }

            cRow++;
            System.out.println(" ");
        }


    }
}
//***** END OF PATTERN 55*****//

