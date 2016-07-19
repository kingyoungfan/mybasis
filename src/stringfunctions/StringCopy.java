package stringfunctions;

/**
 * Created by yangyang on 16/1/21.
 */
public class StringCopy {
    public static void main(String[] args) {
        char ch[] = {'M', 'y', ' ', 'J', 'a', 'v', 'a', ' ', 'e', 'x', 'a', 'm', 'p', 'l', 'e'};
        String chStr = String.copyValueOf(ch);
        System.out.println(chStr);
        String subStr = String.copyValueOf(ch, 3, 4);
        System.out.println(subStr);
    }
}
