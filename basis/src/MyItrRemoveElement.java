import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Below example shows how to remove an element from collection object using Iterator object.
 * The remove() method removes from the underlying collection the last element returned by the iterator
 * Created by yangyang on 16/1/20.
 */
public class MyItrRemoveElement {
    public static void main(String[] args){
        String removeElem = "Perl";
        List<String> myList = new ArrayList<String>();
        myList.add("Java");
        myList.add("Unix");
        myList.add("Oracle");
        myList.add("c++");
        myList.add("Perl");
        System.out.println("Before remove:");
        System.out.println(myList);
        Iterator itr = myList.iterator();
        while (itr.hasNext()){
            if (itr.next().equals(removeElem)){
                itr.remove();
            }
        }
        System.out.println("After remove");
        System.out.println(myList);
    }
}
