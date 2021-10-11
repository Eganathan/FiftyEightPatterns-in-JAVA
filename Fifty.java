public class Fifty extends FiftyEightPatterns{
    //***** START OF PATTERN 50*****//
    public static void Pattern(int input){
    /*  0
        505
        45054
        3450543
        234505432
        12345054321*/

        System.out.println("***Printing the Pattern***");


        System.out.println(0);
        for(int a=input; a >=1; a--){
            for(int b= a; b <= input; b++){
                System.out.print(b);
            }
            System.out.print(0);

            for(int c= input; c >= a; c--){
                System.out.print(c);
            }
            System.out.println(" ");
        }


    }
}
//***** END OF PATTERN 50*****//

