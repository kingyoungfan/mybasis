import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 判断集合的包含关系
 * Created by yangyang on 16/1/20.
 */
public class VectorCheck {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<>();
        vct.add("1");
        vct.add("2");
        vct.add("3");
        vct.add("4");
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(vct.containsAll(list));
        list.add("5");
        System.out.println(vct.containsAll(list));
    }
}
