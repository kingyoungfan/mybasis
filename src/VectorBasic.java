import java.util.Vector;

/**
 * Below example shows how to create vector object, adding elements to it, getting elements by specifying index, getting elements index, getting first element, getting last element, and is vector is empty or not.

 * Created by yangyang on 16/1/20.
 */
public class VectorBasic {
    public static void main(String[] args){
        Vector<String> vector = new Vector<String>();
        vector.add("First");
        vector.add("Second");
        vector.add("Third");
        System.out.println(vector);
        vector.add(2, "Random");
        System.out.println(vector);
        System.out.println("Element at index 3 is :"+ vector.get(3));
        System.out.println("The first element of this vector is :" + vector.firstElement());
        System.out.println("The last element of this vector is :" + vector.lastElement());
        System.out.println("It this vector empty?"+vector.isEmpty());
    }
}
