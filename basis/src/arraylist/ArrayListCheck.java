package arraylist;

import java.util.*;

/**
 * Created by yangyang on 16/1/20.
 */
public class ArrayListCheck {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println("Does ArrayList contains all list elements ?:"+ al.containsAll(list));
        list.add("5");
        System.out.println("Does ArrayList contains all list elements ?:"+ al.containsAll(list));
    }
}
