import java.util.Vector;

/**
 * Created by yangyang on 16/1/20.
 */
public class VectorClear {
    public static void main(String[] args) {
        Vector<String> vct = new Vector<String>();
        vct.add("1");
        vct.add("2");
        vct.add("3");
        System.out.println("Actual vector" + vct);
        vct.clear();
        System.out.println("After vector" + vct);

    }
}
