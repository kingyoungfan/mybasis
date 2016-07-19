package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 打乱list的顺序
 * Created by yangyang on 16/1/20.
 */
public class ArrayListShuffle {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for (String s :
                list) {
            System.out.println(s);
        }
        Collections.shuffle(list);
        System.out.println("Results after shuffle operation:");
        for (String s :
                list) {
            System.out.println(s);
        }
    }
}
