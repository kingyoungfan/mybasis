package arraylist;

import java.util.ArrayList;

/**
 * copy or clone arrayList
 * Created by yangyang on 16/1/20.
 */
public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("1");
        al.add("2");
        al.add("3");
        System.out.println("Actual arrayList:" + al);
        ArrayList<String> copy = (ArrayList<String>) al.clone();
        System.out.println("Clone arrayList:" + copy);
    }
}
