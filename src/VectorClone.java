import java.util.Vector;

/**
 * Created by yangyang on 16/1/20.
 */
public class VectorClone {
    public static void main(String[] args){
        Vector<String> vct = new Vector<String>();
        vct.add("1");
        vct.add("2");
        vct.add("3");
        vct.add("Random");
        System.out.println(vct);
        Vector<String> copy = (Vector<String>) vct.clone();
        copy.add("clone");
        System.out.println(copy);
    }
}
