package util;

import java.util.StringTokenizer;

/**
 * 字符串标记生成器
 * Created by yangyang on 16/1/22.
 */
public class StringTokenize {
    public static void main(String[] args) {
        System.out.println();
    }
}

class SimpleStringTokenize {
    public static void main(String[] args) {
        String msg = "This program gives sample code for String Tokenizer.";
        StringTokenizer st = new StringTokenizer(msg, " ");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}

class StringTokens{
    public static void main(String[] args) {
        String msg = "http://10.123.43.67:80/";
        StringTokenizer st = new StringTokenizer(msg, ":/.");
        while(st.hasMoreTokens()){
            System.out.println(st.nextElement());
        }
    }
}

class StringTokenCount{
    public static void main(String[] args) {
        String msg = "This program gives sample code for String Tokenizer";
        StringTokenizer st = new StringTokenizer(msg, " ");
        System.out.println(st.countTokens());
    }
}
class TokenWithDelimiter{
    public static void main(String[] args) {
        String msg = "http://10.123.43.67:80/";
        StringTokenizer st = new StringTokenizer(msg, ":/.", true);
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
