public class FiftyThree extends FiftyEightPatterns{
    //***** START OF PATTERN 50*****//
    public static void Pattern(int input){
    /*
    1
  4 9 16
 25 36 49 64 81
100 121 144 169 196 225 256
*/

        System.out.println("***Printing the Pattern***");

        int temp =1;
        for(int p = 1; p <= input; p++){

            for(int s=input-p; s >=1; s--){
                System.out.print("  ");
            }

            for(int q=1; q <= (p*2-1); q++){

                System.out.print(temp*temp +" ");
                temp++;
            }
            System.out.println(" ");
        }

    }
}
//***** END OF PATTERN 50*****//

