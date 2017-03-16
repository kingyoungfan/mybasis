package stringfunctions;

/**
 * Created by yangyang on 16/1/21.
 */
public class StringInit {
    public static void main(String[] args) {
        String abc = "this is string object";
        String bcd = new String("this is also string object");
        System.out.println(bcd);
        char[] c = {'a', 'b', 'c', 'd'};
        String cdf = new String(c);
        System.out.println(cdf);
        String junk = abc + " this is another string object";
        System.out.println(junk);
    }
}
