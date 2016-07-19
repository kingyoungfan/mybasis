package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yangyang on 16/1/20.
 */
public class ArrayListSubRange {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("1");
        al.add("2");
        al.add("3");
        System.out.println("Actual arrayList: " + al);
        List<String> list = al.subList(1, 2);
        List<String> newList = new ArrayList<>(list);

        System.out.println("newList list :" + newList);
        System.out.println("Sub list :" + list);
    }
}
