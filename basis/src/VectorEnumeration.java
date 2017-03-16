import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yangyang on 16/1/20.
 */
public class VectorEnumeration {
    public static void main(String[] args){
        Vector<String> vct = new Vector<String>();
        Enumeration<String> en = null;
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        en = vct.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
