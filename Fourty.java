public class Fourty extends FiftyEightPatterns{
    //***** START OF PATTERN 40*****//
    public static void Pattern(int input){
    /*
        1
        2 3
        6 5 4
        7 8 9 10
        15 14 13 12 11*/

        System.out.println(" Printing the Pattern Fourty with "+input +" as rows or input! ");
        int counter=1;
        int row = 0;

        for(int a= 1; a <= input; a++){

            if(a%2 == 0){


                for(int b=1; b <= a; b++){
                    System.out.print(counter+ " ");
                    counter++;


                }

            } else{

                    int reverse = row+counter;
                    for(int b=1; b <= a; b++){

                        System.out.print(reverse-- + " ");
                        counter++;
                }

            }


            System.out.println(" ");
            row++;
        }

    }




}
//***** END OF PATTERN 40*****//
