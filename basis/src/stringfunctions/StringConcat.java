package stringfunctions;

/**
 * Created by yangyang on 16/1/21.
 */
public class StringConcat {
    public static void main(String[] args) {
        String b = "jump";
        String c = "No jump";
        String d = b+c;
        System.out.println(d);
        d = b.concat(c);
        System.out.println(d);
    }
}
