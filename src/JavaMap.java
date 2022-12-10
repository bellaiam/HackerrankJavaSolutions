
//import java.io.*;
import java.util.*;

public class JavaMap {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner input = new Scanner(System.in);
            int numEntries = input.nextInt();
            input.nextLine();
            Map <String, Integer> contacts = new HashMap<>();
            for (int i = 0; i < numEntries; i++) {
                String name = input.nextLine();
                int num = input.nextInt();
                contacts.put(name, num);
                input.nextLine();
            }

            while(input.hasNext()){
                String s = input.nextLine();
                if (contacts.containsKey(s)) {
                    System.out.println(s + "=" + contacts.get(s));
                } else {
                    System.out.println("Not found");
                }
            }

        }
    }