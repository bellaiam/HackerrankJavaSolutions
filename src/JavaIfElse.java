//In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:
//
//Wikipedia if-else flow chart
//
//Source: Wikipedia
//
//Task
//Given an integer, , perform the following conditional actions:
//
//If  is odd, print Weird
//If  is even and in the inclusive range of  to , print Not Weird
//If  is even and in the inclusive range of  to , print Weird
//If  is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.
//
//Input Format
//
//A single line containing a positive integer, .
//
//Constraints
//
//Output Format
//
//Print Weird if the number is weird; otherwise, print Not Weird.
//
//Sample Input 0
//
//3
//Sample Output 0
//
//Weird
//Sample Input 1
//
//24
//Sample Output 1
//
//Not Weird
//Explanation
//
//Sample Case 0:
// is odd and odd numbers are weird, so we print Weird.
//
//Sample Case 1:
// and  is even, so it isn't weird. Thus, we print Not Weird.



import java.util.*;

public class JavaIfElse {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2 != 0) {
            System.out.println("Weird");
        }  if (n%2 == 0) {
            if (n <= 5 && n >= 2 || n > 20) {
                System.out.println("Not Weird");
            }      if (n >= 6 && n <= 20 ) {
                System.out.println("Weird");
            }
        }

    }
}
