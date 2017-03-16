package arraylist;

import java.util.*;

/**
 * add all elements of a list to ArrayList
 * Created by yangyang on 16/1/20.
 */
public class ArrayListNewCollection {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        List<String> list = new ArrayList<>();
        System.out.println("Actual ArrayList:" + al);
        list.add("4");
        list.add("5");
        al.addAll(list);
        System.out.println("After ArrayList" + al);
    }
}
