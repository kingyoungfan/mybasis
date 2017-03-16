import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by yangyang on 16/1/20.
 */
public class VectorNewCollection {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();
        vct.add("1");
        vct.add("2");
        vct.add("3");
        System.out.println("Actual vector" + vct);
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        vct.addAll(list);
        System.out.println("Copy vector" + vct);
        System.out.println(list);
    }
}
