public class ThirtyNine extends FiftyEightPatterns{

    //***** START OF PATTERN 39*****//
    public static void Pattern(int input){
    /*
        1
        3 2
        4 5 6
        10 9 8 7
        11 12 13 14 15*/

        System.out.println(" Printing the Pattern Thirty Nine with "+input +" as rows or input! ");
        int counter=1;
        int row = 0;

        for(int a= 1; a <= input; a++){

            if(a%2 == 0){

                int reverse = row+counter;
                for(int b=1; b <= a; b++){

                    System.out.print(reverse-- + " ");
                    counter++;
                }

            } else{

                for(int b=1; b <= a; b++){
                    System.out.print(counter+ " ");
                    counter++;
                }

            }


            System.out.println(" ");
            row++;
            }

        }




    }
//***** END OF PATTERN 39*****//

