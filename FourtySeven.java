public class FourtySeven extends FiftyEightPatterns{
    //***** START OF PATTERN 46*****//
    public static void Pattern(int input){
    /*
         1
       1 2 1
      1 2 4 2 1
     1 2 4 8 4 2 1
    1 2 4 8 16 8 4 2 1*/

        System.out.println("***Printing the Pattern***");

        //First Part
        for(int a= 1; a <= input; a++){
            int temp=1;

            for(int s= input; s > a; s--){
                System.out.print(" ");
            }
            for(int b=1; b <= a; b++){
                System.out.print(temp + " ");
                temp= temp*2;
            }
            temp = temp/4;
            for(int c=1; c < a; c++){
                System.out.print(temp + " ");
                temp= temp/2;
            }


            System.out.println(" ");
        }



    }}
//***** END OF PATTERN 46*****//

