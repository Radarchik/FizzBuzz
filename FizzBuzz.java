package FizzBuzz;

/**
 * Created by tszin on 05/06/2017.
 */

/** A program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
 * For numbers which are multiples of both three and five print “FizzBuzz “.
 * Stage 2:
 * A number is fizz if it is divisible by 3 or if it has a 3 in it
 * A number is buzz if it is divisible by 5 or if it has a 5 in it
  **/

public class FizzBuzz {

    public static boolean IsDivisorThree(int i){
        return i%3==0;
    }

    public static boolean IsDivisorFive(int i){
        return i%5==0;
    }

    public static boolean HasDigitThree(int i){
        for (char x: (String.valueOf(i)).toCharArray()){
            if (x=='3')
                return true;
        }
        return false;
    }

    public static boolean HasDigitFive(int i){
        for (char x: (String.valueOf(i)).toCharArray()){
            if (x=='5')
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (IsDivisorThree(i)&&IsDivisorFive(i))
                System.out.println("FizzBuzz");
            else if(IsDivisorThree(i)||HasDigitThree(i))
                System.out.println("Fizz");
            else if (IsDivisorFive(i)||HasDigitFive(i))
                System.out.println("Buzz");
            else System.out.println(i);

        }

    }
}