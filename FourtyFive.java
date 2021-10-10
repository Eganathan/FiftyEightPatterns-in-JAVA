public class FourtyFive extends FiftyEightPatterns{
    //***** START OF PATTERN 45*****//
    public static void Pattern(int input){
    /*
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        6 6 6 6
        7 7 7
        8 8
        9*/

        System.out.println("***Printing the Pattern***");

        int temp =1;
        //First Part of the loop
        for(int a= 1; a <= input; a++){

            for(int b= 1; b<= a; b++){
                System.out.print(temp + " ");

            }
            temp++;
            System.out.println("");
        }


        for(int c= input-1; c >= 1; c--){

            for(int d= 1; d <=c; d++){

                System.out.print(temp + " ");
            }
            System.out.println();
            temp++;
        }


    }}
//***** END OF PATTERN 45*****//

