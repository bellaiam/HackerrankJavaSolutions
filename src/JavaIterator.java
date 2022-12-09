import java.util.*;
public class JavaIterator {
    @SuppressWarnings("rawtypes")
    static Iterator func(ArrayList mylist){
        Iterator it=mylist.iterator();
        while(it.hasNext()){
            if(it.next() instanceof String)
                break;
        }
        return it;
    }

    public static void main(String []args)    {
        ArrayList mylist = new ArrayList();
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            mylist.add(input.nextInt());
        }
        mylist.add("###");
        while(input.hasNext()){
            mylist.add(input.next());
        }
        Iterator it=func(mylist);
        while(it.hasNext())
        {
            System.out.println((String)it.next());
        }

    }
}