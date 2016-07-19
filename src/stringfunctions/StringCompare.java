package stringfunctions;

/**
 * compare two strings object
 * equalsIgnoreCase()为忽略大小写的比较
 * String 字符串常量
 * StringBuffer 字符串变量, 线程安全,同步的
 * StringBuilder 字符串变量, 非线程安全,异步的
 * Created by yangyang on 16/1/21.
 */
public class StringCompare {
    public static void main(String[] args) {
        String x = "junk";
        String y = "JUNK";
        if (x.equals(y)) {
            System.out.println("Both string are equal.");
        } else {
            System.out.println("Both string are not equal");
        }

        if (x.equalsIgnoreCase(y)) {
            System.out.println("Both string are equal.");
        } else {
            System.out.println("Both string are not equal");
        }
    }
}

class StringCompareStringBuffer {
    public static void main(String[] args) {
        String c = "We are comparing the content with a StringBuffer content";
        StringBuffer sb = new StringBuffer("We are comparing the content with a StringBuffer content");
        if (c.contentEquals(sb)) {
            System.out.println("The content is equal.");
        } else {
            System.out.println("The content is not equal.");
        }
        StringBuffer asb = new StringBuffer("You cannot compare the content with a String content");
        if (c.contentEquals(asb)) {
            System.out.println("The content is equal.");
        } else {
            System.out.println("The content is not equal.");
        }
    }
}