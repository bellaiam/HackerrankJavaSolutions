import java.io.*;
import java.util.*;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        List <Integer> listik = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            listik.add(input.nextInt());
        }
        int numOfQueries = input.nextInt();
        for (int i = 0; i < numOfQueries; i++) {
            String action = input.next();
            if (action.equals("Insert")) {
                int x = input.nextInt();
                int y = input.nextInt();
                listik.add(x, y);
            } else {
                listik.remove(input.nextInt());
            }
        }
        for(Integer num : listik){
            System.out.print(num + " ");
        }
    }
}