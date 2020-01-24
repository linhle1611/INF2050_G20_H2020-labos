public class fizzBuzz{

    public static void main (String[] args){

        int max = ( args.length > 0 ) ? Integer.parseInt(args[0]) : 100;

        for (int i = 1; i<= max ; ++i){  
            if (i % 15 == 0) System.out.print ("FizzBuzz");
            else if (i % 5 == 0) System.out.print("Buzz");
            else if (i % 3 == 0) System.out.print("Fizz");
            else System.out.print(i);

            System.out.print(", ");
        }

        System.out.println();
    }
}
