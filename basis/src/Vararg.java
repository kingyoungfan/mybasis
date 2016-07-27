/**
 * 不定长参数
 * Created by yangyang on 16/1/11.
 */
public class Vararg {
    public void print(String... args) {
        for (String arg : args) {
            System.out.println("++++++++++++" + arg);
        }
    }

    public void print(String test) {
        System.out.println("----------" + test);
    }

    public static void main(String[] args) {
        Vararg test = new Vararg();
        test.print("hello");
        test.print("hello", "alexia");

    }
}
