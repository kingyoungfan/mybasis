import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by yangyang on 16/1/20.
 */
public class MyEnumeration {
    public static void main(String[] args){
        Vector<String> vector = new Vector<String>();
        Enumeration en = null;
        vector.add("JAVA");
        vector.add("PYTHON");
        vector.add("JAVASCRIPT");
        en = vector.elements();
        System.out.println(vector);
        while (en.hasMoreElements()){
            System.out.println(en.nextElement());
        }
    }
}
