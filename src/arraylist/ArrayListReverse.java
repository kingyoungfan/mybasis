package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 反转list
 * Created by yangyang on 16/1/20.
 */
public class ArrayListReverse {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        Collections.reverse(list);
        System.out.println("Results after reverse operation:");
        for (String s : list) {
            System.out.println(s);
        }

    }

}
