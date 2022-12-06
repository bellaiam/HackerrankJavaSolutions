//A palindrome is a word, phrase, number, or other sequence of characters which reads the
// same backward or forward.
//
//Given a string A, print Yes if it is a palindrome, print No otherwise.
//
//Constraints
//
//A will consist at most 50 lower case english letters.
//Sample Input
//
//madam
//Sample Output
//
//Yes
//CODE

    //import java.io.*;
import java.util.*;

    public class JavaStringReverse {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            StringBuilder rev = new StringBuilder();
            for (int i = A.length()-1; i >= 0; i--) {
                rev.append(A.charAt(i));
            }

            if (A.equals(rev.toString())){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }

