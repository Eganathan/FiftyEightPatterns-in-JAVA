public class FourtyFour extends FiftyEightPatterns{
    //***** START OF PATTERN 44*****//
    public static void Pattern(int input){
    /*
        1
        2 3 2
        3 4 5 4 3
        4 5 6 7 6 5 4
        5 6 7 8 9 8 7 6 5
        4 5 6 7 6 5 4
        3 4 5 4 3
        2 3 2
        1*/

        System.out.println(" Printing the Pattern Fourty Three with "+input +" as rows or input! ");

        //First Part of the loop
        for(int a= 1; a <= input; a++){

            int temp =a;
            for(int b= 1; b <= a; b++){
                System.out.print(temp+ " ");
                temp++;
            }
            temp = temp-2;
            for(int b= 1; b < a; b++){
                System.out.print(temp+ " ");
                temp--;
            }

            System.out.println("");
        }

        //Second Part of the loop
        for(int a= input-1; a >= 1; a--){
            int temp = a;
            for(int b= 1; b <= a; b++){
                System.out.print(temp+ " ");
                temp++;
            }
            temp = temp-2;
            for(int b= 1; b < a; b++){
                System.out.print(temp+ " ");
                temp--;
            }

            System.out.println("");
        }
    }}
//***** END OF PATTERN 44*****//

