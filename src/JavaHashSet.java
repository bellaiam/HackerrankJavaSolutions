import java.util.*;

public class JavaHashSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        Set <String> names = new HashSet <String>();
        int num = input.nextInt();
        String [] leftName = new String[num];
        String [] rightName = new String[num];
        for (int i = 0; i < num; i++) {
            leftName[i] = input.next();
            leftName[i] = input.next();
        }
        for (int i = 0; i < num; i++) {
            names.add(leftName[i] + " " + rightName[i]);
            System.out.println(names.size());
        }
        input.close();
    }
}