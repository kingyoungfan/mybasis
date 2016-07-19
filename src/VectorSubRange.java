import java.util.List;
import java.util.Vector;

/**
 * get sub list from vector
 * Created by yangyang on 16/1/20.
 */
public class VectorSubRange {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();
        vct.add("1");
        vct.add("2");
        vct.add("3");
        vct.add("4");
        System.out.println("Actual vector" + vct);
        List<String> list = vct.subList(1, 2);
        System.out.println("Sub list" + list);
    }
}
