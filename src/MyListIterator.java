import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by yangyang on 16/1/20.
 */
public class MyListIterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("java");
        myList.add("3");
        myList.add("30");
        myList.add("77");
        ListIterator litr = myList.listIterator();
        while (litr.hasNext()) {
            System.out.println(litr.next());
        }
        while (litr.hasPrevious()) {
            System.out.println(litr.previous());
        }
    }
}
