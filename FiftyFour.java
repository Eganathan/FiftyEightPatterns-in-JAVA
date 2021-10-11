public class FiftyFour extends FiftyEightPatterns{
    //***** START OF PATTERN 54*****//
    public static void Pattern(int input){
    /*
    1
   2 3 2
  4 5 6 5 4
 7 8 9 0 9 8 7
1 2 3 4 5 4 3 2 1
*/

        System.out.println("***Printing the Pattern***");

        int temp =1;
        int temp2 = 0;
        for(int p = 1; p <= input; p++){
            
            for(int s= input-1; s >=p; s--){
                System.out.print("  ");
            }
            

            for(int q= p; q >=1; q--){

                if(temp < 10){

                    System.out.print(temp+ " ");
                    temp++;
                }else{
                    temp =0;
                    System.out.print(temp+ " ");
                    temp++;

                }

                temp2= temp-1;
            }

            for(int x= 2; x <= p; x++){

                if(temp2 <= 0){

                    temp2 =9;
                    System.out.print(--temp2+ " ");
                }else{
                    System.out.print(--temp2+ " ");
                }}




            System.out.println(" ");
        }

    }
}
//***** END OF PATTERN 54*****//

