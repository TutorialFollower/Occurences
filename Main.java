import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        //declaring user input
        Scanner n = new Scanner(System.in);
        //asking for user input
        int number = n.nextInt();
      
        //vars where the number bits are stored
        int case1;
        int case2;
        int case3;
         
        //Number of occurences
        int count = 0;
        //Runs the loop
        int loopRunner = 1;
        //Main loop
        while (loopRunner > 0){
            
          //Main logic(dividing the integer into sperate numbers)
           int rem = number % 10;
           number = number / 10;
           case1 = rem;
           rem = number % 10;
           case2 = rem;
           number = number / 10;
           rem = number % 10;
           case3 = rem;

           //Check for occurences
           if(case1 == case2){
                count++;
           }

            if(case1 == case3){
                count++;
            }

            if(case3 == case1){
                count++;
            }

           if(case2 == case1){
               count++;
           }

            if(case2 == case3){
                count++;
            }
            if(case3 == case2){
                count++;
            }
            
            //Debugging tools
            /*System.out.println(case1);
            System.out.println(case2);
            System.out.println(case3);*/
            //print the number of occurences
            System.out.println(count);
            //Terminate the loop
           loopRunner = loopRunner - 1;
        }

    }
}
