import java.io.*;
import java.util.*;


    public class JavaExceptionHandlingTryCatch {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner input = new Scanner(System.in);
            try {
                int x = input.nextInt();
                int y = input.nextInt();
                System.out.println(x/y);
            } catch(InputMismatchException e) {
                System.out.println("java.util.InputMismatchException");
            } catch(ArithmeticException e) {
                System.out.println("java.lang.ArithmeticException: / by                zero");
            }
        }
    }