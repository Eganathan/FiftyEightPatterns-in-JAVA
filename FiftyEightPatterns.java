import java.util.Scanner;

import static java.lang.Thread.sleep;

public class FiftyEightPatterns {
    int input;





    //***** START OF PATTERN 02*****//
    /*
      1
      2 2
      3 3 3
      4 4 4 4
      5 5 5 5 5
    */
    public static void Pattern_Two(int input){

        System.out.println(" Printing the Pattern Two with "+input +" number of rows");

        //for loop which has an int x with the value 1 and will increment and loop through till x <= the input value
        for (int x = 1; x <= input; x++){


            // Nested loop that runs if y <= x so we get 1 for the first loop and 1,2 when x =2 and 1,2,3 when x = 3 ...
            //Note here we print x the value of master loop
            for (int y = 1; y <= x; y++){
                // Prints the value of the x during the nested loop is true along with a space for a better visibility
                System.out.print(x + " ");
            }
            //Getting the pointer to a new line
            System.out.println();
        }

    }//***** END OF PATTERN 02*****//

    //***** START OF PATTERN 03*****//
    /*
      1
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5
      1 2 3 4
      1 2 3
      1 2
      1
    */
    public static void Pattern_Three(int input){

        System.out.println(" Printing the Pattern Three with "+input +" as an input! ");

        //Loop for the First Half
        //for loop which has an int x with the value 1 and will increment and loop through till x <= the input value
        for (int x = 1; x <= input; x++){
            // Nested loop that runs if y <= x so we get 1 for the first loop and 1,2 when x =2 and 1,2,3 when x = 3 ...
            for (int y = 1; y <= x; y++){
                // Prints the value of the x during the nested loop is true along with a space for a better visibility
                System.out.print(y + " ");
            }
            //Getting the pointer to a new line
            System.out.println();
        }

        //Loop for the Second Half
        //for loop which has an int x with the value 5 and will decrement and loop through till x <= the input value
        for (int x = input; x >= 1; --x){
            // Nested loop that runs if y < x so we get 1,2,3,4 for the first loop and 1,2,3 when x =4,3,2,1
            //Since we didnt want the input value in the second half we removed = from the condition
            for (int y = 1; y < x; y++){
                // Prints the value of the x during the nested loop is true along with a space for a better visibility
                System.out.print(y + " ");
            }
            //Getting the pointer to a new line
            System.out.println();
        }
    }//***** END OF PATTERN 03*****//

    //***** START OF PATTERN 04*****//
    /*
            1 2 3 4 5
            1 2 3 4
            1 2 3
            1 2
            1
            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
    */
    public static void Pattern_Four(int input){

        System.out.println(" Printing the Pattern Four with "+input +" as an input! ");

        //Loop for the First Half
        //for loop which has an int x with the value 5 and will decrement and loop through till x >= 1 the input value
        for (int x = input; x >= 1; x--){
            // Nested loop that runs if y <= x so we get 1 for the first loop and 1,2 when x =2 and 1,2,3 when x = 3 ...
            for (int y = 1; y <= x; y++){
                // Prints the value of the x during the nested loop is true along with a space for a better visibility
                System.out.print(y + " ");
            }
            //Getting the pointer to a new line
            System.out.println();
        }

        //Loop for the Second Half
        //for loop which has an int x with the value 5 and will increment and loop through till x <= the input value
        for (int x = 1; x <= input; x++){
            // Nested loop that runs if y <= x so we get 1 for the first loop and 1,2 - 1,2,3 ..when x =1,2,3,4,5
            for (int y = 1; y <= x; y++){
                // Prints the value of the x during the nested loop is true along with a space for a better visibility
                System.out.print(y + " ");
            }
            //Getting the pointer to a new line
            System.out.println();
        }
    }//***** END OF PATTERN 04*****//


    //***** START OF PATTERN 05*****//
    public static void Pattern_Five(int input){

        System.out.println(" Printing the Pattern Five with "+input +" as an input! ");

        //Loop for the First Half
        //for loop which has an int x with the value 5 and will decrement and loop through till x >= 1 the input value
        for (int x = input; x >= 1; x--){
            // Nested loop that runs if y <= x so we get 1 for the first loop and 1,2 when x =2 and 1,2,3 when x = 3 ...
            for (int y = x; y >= 1; y--){
                // Prints the value of the x during the nested loop is true along with a space for a better visibility
                System.out.print(y + " ");
            }
            //Getting the pointer to a new line
            System.out.println();
        }

        //Loop for the Second Half
        //for loop which has an int h with the value 1 and will increment and loop through till h <= the input value
        for (int h = 1; h <= input; h++){
            // Nested loop that runs if i >= 1 so we get the value i  to 1 for the first loop and 1 - 2,1 - 3,2,1 ..when x =1,2,3,4,5
            for (int i = h; i >= 1; i--){
                // Prints the value of the x during the nested loop is true along with a space for a better visibility
                System.out.print(i + " ");
            }
            //Getting the pointer to a new line
            System.out.println();
        }
    }//***** END OF PATTERN 05*****//

    //***** START OF PATTERN 06*****//
    public static void Pattern_Six(int input){

        System.out.println(" Printing the Pattern Six with "+input +" as an input! ");

        for (int h = 1; h <= input; h++){

            for (int i = 5; i > h; i--){
                System.out.print( " ");
                }

            for (int j =1; j <= h; j++){
            System.out.print(j + " ");}

        System.out.println( " ");
        }
    }//***** END OF PATTERN 06*****//


    //***** START OF PATTERN 10*****//
    public static void Pattern_Ten(int input){

        System.out.println(" Printing the Pattern Ten with "+input +" as an input! ");
        int k = 1;
        for (int h = 1; h <= input; h++){
            for (int i = 1; i <= h; i++ ){
                System.out.print(k+ " ");
                k++;
            }
            System.out.println("");
        }
    }//***** END OF PATTERN 10*****//

    //***** START OF PATTERN 11*****//
    public static void Pattern_Eleven(int input){

        System.out.println(" Printing the Pattern Eleven with "+input +" as an input! ");
        for (int h = 1; h <= input; h++){

            for (int i = h; i >= 1; i-- ){
                System.out.print(i+ " ");
            }
            System.out.println("");
        }
    }//***** END OF PATTERN 11*****//

    //***** START OF PATTERN 12*****//

        /*
        1
        2 7
        3 8 13
        4 9 14 19
        5 10 15 20 25
         */
    public static void Pattern_Twelve(int input){

        System.out.println(" Printing the Pattern Eleven with "+input +" as an input! ");
        for (int i = 1; i <= input; i++){
            int temp = i;
            for(int j = 1; j <= i; j++ ){
                System.out.print(temp + " ");
                temp+=input;
            }
            System.out.println("");
        }

    }//***** END OF PATTERN 12*****//


    //***** START OF PATTERN 14*****//

    /*
    1
    1 2 1
    1 2 3 2 1
    1 2 3 4 3 2 1
    1 2 3 4 5 4 3 2 1
     */
    public static void Pattern_Fourteen(int input){

        System.out.println(" Printing the Pattern Fourteen with "+input +" as an input! ");
        for(int x= 1; x <= input; x++){
            int temp = 0;

            for(int y=1; y <= x; y++){
                System.out.print(y+ " ");
                temp = y;
            }

            for(int z = temp-1; z >= 1; z--){
                System.out.print(z+ " ");
            }
            System.out.println("");
        }

    }//***** END OF PATTERN 14*****//



    //***** START OF PATTERN 16*****//

    /*
        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
     1 2 3 4
      1 2 3
       1 2
        1
     */
    public static void Pattern_Sixteen(int input){

        System.out.println(" Printing the Pattern Sixteen with "+input +" as an input! ");

        //First Part of the loop
        for(int a =1; a <= input ; a++){

            for (int b=input-a; b >= 1; b--){
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++){
                System.out.print(c+ " ");
            }
            System.out.println("");
        }

        //Second Part of the loop
        for(int a =input-1; a >=1 ; a--){

            for (int b=input-a; b >= 1; b--){
                System.out.print(" ");
            }
            for (int c = 1; c <= a; c++){
                System.out.print(c+ " ");
            }
            System.out.println("");
        }
}//***** END OF PATTERN 16*****//

    //***** START OF PATTERN 17*****//

    /*
        12345
         2345
          345
           45
            5
            5
           45
          345
         2345
        12345
     */
    public static void Pattern_Seventeen(int input){

        System.out.println(" Printing the Pattern Seventeen with "+input +" as an input! ");


        for(int a = 1; a <= input; a++){

            for (int b = 1; b < a; b++){
                System.out.print("  ");
            }

            for (int c = a; c <= input; c++){
                System.out.print(c + " ");
            }

        System.out.println("");
        }
        //Second part of loop

        for (int a= input; a >=1; a--){
            for(int b=a-1; b >=1;b-- ){
                System.out.print("  ");
            }
            for(int c = a; c <= input; c++ ){
                System.out.print(c+ " ");
            }
        System.out.println(" ");
        }
    }//***** END OF PATTERN 17*****//



    //***** START OF PATTERN 18*****//


    public static void Pattern_Eighteen(int input){

    /*
    1 2 3 4 5
     2 3 4 5
      3 4 5
       4 5
        5
        5
       4 5
      3 4 5
     2 3 4 5
    1 2 3 4 5 */
    System.out.println(" Printing the Pattern EightTeen with "+input +" as an input! ");

    //First part of Pattern
        for(int a = 1; a <= input; a++){

            for(int b = 1; b < a; b++){
                System.out.print(" ");
            }

            for(int c = a; c <= input; c++){
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }



        //Second part of Pattern
        for(int a = input; a >= 1; a--){

            for(int b = 1; b < a; b++){
                System.out.print(" ");
            }

            for(int c = a; c <= input; c++){
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }
    }//***** END OF PATTERN 18*****//

    //***** START OF PATTERN 19*****//
    public static void Pattern_Nineteen(int input){
    /*
        5
       4 5
      3 4 5
     2 3 4 5
    1 2 3 4 5 */
        System.out.println(" Printing the Pattern NineTeen with "+input +" as an input! ");

        //First part of Pattern
        for(int a =input; a >= 1; a--){

            for(int b = a; b > 1; b--) {
                System.out.print(" ");
            }

            for(int c = a; c <= input; c++){
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }
    }//***** END OF PATTERN 19*****//

    //***** START OF PATTERN 20*****//
    public static void Pattern_Twenty(int input){
    /*
        1
       121
      12321
     1234321
    123454321*/
        System.out.println(" Printing the Pattern Twenty with "+input +" as rows or input! ");

        for (int a=1; a <= input; a++){

            for(int space = input-a; space >=1; space--){
                System.out.print("  ");
            }

            for (int b=1; b <=a; b++){
                System.out.print(b + " ");
            }
            for (int c= a-1; c >=1; c--){
                System.out.print(c + " ");
            }
            System.out.println(" ");
        }

    }//***** END OF PATTERN 20*****//

    //***** START OF PATTERN 21*****//
    public static void Pattern_TwentyOne(int input){
    /*
        1
        1 0
        1 0 1
        1 0 1 0
        1 0 1 0 1*/
        System.out.println(" Printing the Pattern Twenty One with "+input +" as rows or input! ");


        for (int a=1; a <= input; a++){
            int temp = 1;
            for(int b=1; b <= a; b++){
                if(temp == 1){
                    System.out.print(temp + " ");
                    temp = 0;
                }else if( temp == 0){
                    System.out.print(temp + " ");
                    temp = 1;
                }
            }

            System.out.println(" ");
        }

    }//***** END OF PATTERN 21*****//

    //***** START OF PATTERN 22*****//
    public static void Pattern_TwentyTwo(int input){
    /*
        1 0 0 0 0
        0 2 0 0 0
        0 0 3 0 0
        0 0 0 4 0
        0 0 0 0 5 */
        System.out.println(" Printing the Pattern Twenty Two with "+input +" as rows or input! ");


        for (int a=1; a <= input; a++){
            for(int b=1; b <= input; b++){
                if(a == b){
                    System.out.print(b + " ");
                } else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println(" ");
        }

    }//***** END OF PATTERN 22*****//

    //***** START OF PATTERN 23*****//
    public static void Pattern_TwentyThree(int input){
    /*
        1 1 1 1 1
        1 1 1 2 2
        1 1 3 3 3
        1 4 4 4 4
        5 5 5 5 5 */
        System.out.println(" Printing the Pattern Twenty Three with "+input +" as rows or input! ");


        for (int a=1; a <= input; a++){
            for(int b=1; b <= input; b++){
                if(b <= input-a){
                    System.out.print(1 + " ");
                } else{
                    System.out.print(a + " ");
                }
            }
            System.out.println(" ");
        }

    }//***** END OF PATTERN 23*****//

    //***** START OF PATTERN 24*****//
    public static void Pattern_TwentyFour(int input){
    /*
        1 2 3 4 5 4 3 2 1
        2 3 4 5 4 3 2
        3 4 5 4 3
        4 5 4
        5 */
        System.out.println(" Printing the Pattern Twenty Four with "+input +" as rows or input! ");

        int temp =0;

        for(int a = input; a >= 1; a--){
            temp +=1;
            //Loop One
            for(int b =temp; b <= input; b++){
                System.out.print(b + " ");
            }
            //Two
            for(int c =input-1; c >= temp && c!=0; c--){
                System.out.print(c + " ");
            }

            System.out.println(" ");
        }
    }//***** END OF PATTERN 24*****//

    //***** START OF PATTERN 25*****//
    public static void Pattern_TwentyFive(int input){
    /*
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5 */
        System.out.println(" Printing the Pattern Twenty Five with "+input +" as rows or input! ");

        for(int a= 1; a <= input; a++){

            for(int b=input-a; b >= 1; b--){
                System.out.print(" ");
            }

            for(int c=1; c <=a; c++){
                System.out.print(a+ " ");
            }

            System.out.println( " ");
        }

    }//***** END OF PATTERN 25*****//


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
                System.out.print(5+ " ");
            }
            System.out.println( " ");
        }

    }//***** END OF PATTERN 26*****//





    public static void main(String[] args){

        //
        //Pattern_Two(5);
        //Pattern_Three(5);
        //Pattern_Four(5);
        //Pattern_Five(5);
         //Pattern_Six(5);
         //Pattern_Ten(5);
         //Pattern_Eleven(5);
         //Pattern_Twelve(5);
         //Pattern_Fourteen(5);
         //Pattern_Fifteen(5);
         //Pattern_Sixteen(5);
         //Pattern_Seventeen(5);
         //Pattern_Eighteen(5);
         //Pattern_Nineteen(5);
         //Pattern_Twenty(5);
         //Pattern_TwentyOne(5);
         //Pattern_TwentyTwo(5);
         //Pattern_TwentyThree(5);
         //Pattern_TwentyFour(5);
         //Pattern_TwentyFive(5);
        //Pattern_TwentySix(5);
        //TwentySeven.Pattern_TwentySeven(5);
        //TwentyEight.Pattern_TwentyEight(7);
        //TwentyNine.Pattern_TwentyNine(5);
        //Thirty.Pattern_Thirty(5);
        //ThirtyOne.Pattern_ThirtyOne(5);
        //ThirtyTwo.Pattern_ThirtyTwo(5);
        //ThirtyThree.Pattern_ThirtyThree(5);
        //ThirtyFour.Pattern(5);
        //ThirtyFive.Pattern(5);
        //ThirtySix.Pattern(5);
        //ThirtySeven.Pattern(5);
        //ThirtyEight.Pattern(5);
        //ThirtyNine.Pattern(5);
        //Fourty.Pattern(5);
        //FourtyOne.Pattern(5);
        //FourtyTwo.Pattern(5);
        //FourtyThree.Pattern(5);
        //FourtyFour.Pattern(5);
        //FourtyFive.Pattern(5);
        //FourtySix.Pattern(5);
        //FourtySeven.Pattern(5);
        //FourtyEight.Pattern(5);
        //FortyNine.Pattern(5);
        //Fifty.Pattern(5);
        //FiftyOne.Pattern(5);
        //FiftyTwo.Pattern(5);
        //FiftyThree.Pattern(5);
        //FiftyFour.Pattern(5);
        //FiftyFive.Pattern(5);
        //FiftySix.Pattern(5);
        //FiftySeven.Pattern(5);
        //FiftyEight.Pattern(5);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Hi, Hope you are doing well!");
        System.out.println("Whats your name ?");
        String name = myObj.nextLine();
        System.out.println( name+"! Which pattern would you link me to print? ");
        System.out.println("* Must be between 1 - 58 *");
        int patternNumber = myObj.nextInt();
        System.out.println(name+"Let me know the prefered number of rows");
        int rowNumber = myObj.nextInt();


        if(patternNumber >=1 && patternNumber <= 58){

            switch (patternNumber){
                case 1:
                    One.Pattern(rowNumber);
                    break;
                case 2:
                    Pattern_Two(rowNumber);
                    break;
                case 3:
                    Pattern_Three(rowNumber);
                    break;
                case 4:
                    Pattern_Four(rowNumber);
                    break;
                case 5:
                    Pattern_Five(rowNumber);
                    break;
                case 6:
                    Pattern_Six(rowNumber);
                    break;
                case 7:
                    Pattern_Seven(rowNumber);
                    break;
                case 8:
                    Pattern_Eight(rowNumber);
                    break;
                case 9:
                    Pattern_Nine(rowNumber);
                    break;
                case 10:
                    Pattern_Ten(rowNumber);
                    break;
                case 11:
                    Pattern_Eleven(rowNumber);
                    break;
                case 12:
                    Pattern_Twelve(rowNumber);
                    break;
                case 13:
                    Thirteen.Pattern(rowNumber);
                    break;
                case 14:
                    Pattern_Fourteen(rowNumber);
                    break;
                case 16:
                    Pattern_Sixteen(rowNumber);
                    break;
                case 17:
                    Pattern_Seventeen(rowNumber);
                    break;
                case 18:
                    Pattern_Eighteen(rowNumber);
                    break;
                case 19:
                    Pattern_Nineteen(rowNumber);
                    break;
                case 20:
                    Pattern_Twenty(rowNumber);
                    break;
                case 21:
                    Pattern_TwentyOne(rowNumber);
                    break;
                case 22:
                    Pattern_TwentyTwo(rowNumber);
                    break;
                case 23:
                    Pattern_TwentyThree(rowNumber);
                    break;
                case 24:
                    Pattern_TwentyFour(rowNumber);
                    break;
                case 25:
                    Pattern_TwentyFive(rowNumber);
                    break;
                case 26:
                    Pattern_TwentySix(rowNumber);
                    break;
                case 27:
                    TwentySeven.Pattern(rowNumber);
                    break;
                case 27:
                    TwentySeven.Pattern(rowNumber);
                    break;


            }



        }else{
            System.out.println("Please Enter a Pattern between 1-58!");
        }



    }
}
