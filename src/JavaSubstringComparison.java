/*
We define the following terms:
Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.
A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .
Input Format
The first line contains a string denoting .
The second line contains an integer denoting .
Constraints
 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Output Format
Return the respective lexicographically smallest and largest substrings as a single newline-separated string.
Sample Input 0
welcometojava
3
Sample Output 0
ava
wel
Explanation 0
String  has the following lexicographically-ordered substrings of length :
We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
The stub code in the editor then prints ava as our first line of output and wel as our second line of output.
*/


/*CODE*/
public class JavaSubstringComparison{

public static String getSmallestAndLargest(String s,int k){

        String smallest=s.substring(0,k);
        String largest=s.substring(0,k);

        for(int i=0;i<s.length()-k+1;i++){
        String sub=s.substring(i,i+k);
        if(smallest.compareTo(sub)>0)
        smallest=sub;
        if(largest.compareTo(sub)< 0)
        largest=sub;
        }
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest+"\n"+largest;
        }
}


