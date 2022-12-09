import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class JavaIterator{
    public static <T> void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        Iterator it = mylist.iterator();
        while(it.hasNext()) {
            Object element = it.next();
            System.out.println((String) element);
            //List<Object> abc = new ArrayList<>();
            //method1(new ArrayList<>())
        }
    }
}
