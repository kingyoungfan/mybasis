import java.util.*;

/**
 * Created by yangyang on 16/1/20.
 */
public class VectorIterator {
    public static void main(String[] args){
        Vector<String> vct = new Vector<String>();
        vct.add("First");
        vct.add("Second");
        vct.add("Random");
        Iterator<String> itr = vct.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
