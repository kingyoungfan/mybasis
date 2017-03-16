import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * You can iterate through any collection object by using Iterator object.
 * It provides two methods to iterate. The hasNext() method returns true if the iteration has more elements.
 * The next() method returns the next element in the iteration. Below example shows how to iterate through an ArrayList.
 *
 *
 *
 * Created by yangyang on 16/1/20.
 */
public class MyCollectionIterator {

    public static void main(String[] args){
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Python");
        Iterator itr = myList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
