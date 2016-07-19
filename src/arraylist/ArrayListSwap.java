package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 交换元素
 * Created by yangyang on 16/1/20.
 */
public class ArrayListSwap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        Collections.swap(list, 2, 5);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
