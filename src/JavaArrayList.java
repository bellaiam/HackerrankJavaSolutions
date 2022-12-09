
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<List<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        for (int j = 0; j < n; j++){
            int d = input.nextInt();
            for (int i = 0; i< d; i++) {
                inner.add(input.nextInt());
            }
            outer.add(new ArrayList<>(inner));
            inner.clear();
        }

        int q = input.nextInt();
        for(int i = 0; i < q; i++) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;

            if(x < outer.size() && y < outer.get(x).size()){
                System.out.println(outer.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}