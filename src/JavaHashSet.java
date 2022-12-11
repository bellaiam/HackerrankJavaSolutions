import java.util.*;

    public class JavaHashSet {
        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner input = new Scanner(System.in);
            Set <String> names = new HashSet <>();
            int num = input.nextInt();
            input.nextLine();
            for (int i = 0; i < num; i++) {
                names.add(input.nextLine());
                System.out.println(names.size());
            }
            input.close();
        }
    }