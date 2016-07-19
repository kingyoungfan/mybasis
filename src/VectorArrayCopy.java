import java.util.Arrays;
import java.util.Vector;

/**
 * copy vector to array
 * Created by yangyang on 16/1/20.
 */
public class VectorArrayCopy {
    public static void main(String[] args){
        Vector<String> vct = new Vector<>();
        vct.add("1");
        vct.add("2");
        vct.add("3");
        System.out.println("Actual vector"+vct);
        String[] copyArr  = new String[vct.size()];
        vct.copyInto(copyArr);
        System.out.println(Arrays.toString(copyArr));

    }
}
