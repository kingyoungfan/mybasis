package stringfunctions;

import java.util.Arrays;
import java.util.Locale;
import java.util.StringTokenizer;

/**
 * lastIndexOf()
 * Created by yangyang on 16/1/21.
 */
public class StringLastIndexOf {
    public static void main(String[] args) {
        String str = "Use this string for testing this";
        System.out.println(str.length());
        System.out.println("Basic lastIndexOf() example");
        System.out.println("Char 's' at last occurance:" + str.lastIndexOf('s'));
        System.out.println("String \"this\" at last occurance" + str.lastIndexOf("this"));
        System.out.println("first occurance of char 's' from 24th index backwards: " + str.lastIndexOf('s', 24));
        System.out.println("First occurance of String \"this\" from 26th index backwards: " + str.lastIndexOf("this", 26));
    }
}

class StringStartWith {
    public static void main(String[] args) {
        String str = "This is an example string.";
        System.out.println("Is this string starts with \"This\"?" + str.startsWith("This"));
        System.out.println("Is this string starts with \"is\"?" + str.startsWith("is"));
        System.out.println("Is this string starts with \"is\"?" + str.startsWith("is", 5));
    }
}

class StringEndsWith {
    public static void main(String[] args) {
        String str = "This is a java string example";
        if (str.endsWith("example")) {
            System.out.println("This String ends with example");
        } else {
            System.out.println("This String is not ending with example");
        }
    }

}

class MyStrSplit {

    public static void main(String a[]) {

        String str = "This program splits a string based on space";
        String[] tokens = str.split(" ");
        for (String s : tokens) {
            System.out.println(s);
        }
        str = "This     program  splits a string based on space";
        String[] strArr = str.split("\\s+");
        System.out.println(Arrays.toString(strArr));
    }
}

class MyCharArrayCopy {

    public static void main(String a[]) {

        String str = "Copy chars from this string";
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
        /**
         * The getChars() method accepts 4 parameters
         * first one is the start index from string
         * second one is the end index from string
         * third one is the destination char array
         * forth one is the start index to append in the
         * char array.
         */
        System.out.println(chars);
        str.getChars(5, 10, chars, 3);
        System.out.println(chars);
    }
}

class StringReplace {
    public static void main(String[] args) {
        String str = "This is an example string";
        System.out.println("Replace char 's' with 'o' : " + str.replace('s', '0'));
        System.out.println("Replace first occurance of string\"is\" with \"ui\" : " + str.replaceFirst("is", "ui"));
        System.out.println("Replace \"is\" every where with \"no\" : " + str.replaceAll("is", "no"));
    }
}

class StringCase {
    public static void main(String[] args) {
        String str = "Change My Case";
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());
    }

}

class StringTrim {
    public static void main(String[] args) {
        String str = "   Junk     ";
        System.out.println(str.trim());
    }
}

class StringFormatter {
    public static void main(String[] args) {
        String str = "This is %s format example";
        System.out.println(String.format(str, "string"));
        String str1 = "We are displaying no %d";
        System.out.println(String.format(str1, 10));
        System.out.println("String format with Locale info:");
        System.out.println(String.format(Locale.CHINESE, str1, 10));
    }
}

class StringMatch {
    public static void main(String[] args) {
        /**
         *正则表达式
         */
        String[] str = {"www.java2novice.com", "http://java2novice.com"};
        for (int i = 0; i < str.length; i++) {
            if (str[i].matches("^www\\.(.+)")) {
                System.out.println(str[i] + " Starts with 'www'");
            } else {
                System.out.println(str[i] + " is not starts with 'www'");
            }
        }
    }
}

class StringRemoveMultipleSpace {
    public static void main(String[] args) {
        String str = "  String    With Multiple      Spaces";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreElements()) {
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb);
    }
}

class NonAsciiString {
    /**
     * 去除非ASCII字符
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "Bj��rk����oacute�";
        System.out.println(str);
        str = str.replaceAll("[^\\p{ASCII}]", "");
        System.out.println(str);
    }
}

class HtmlTagRemove {
    public static void main(String[] args) {
        String text = "<B>I don't want this to be bold<\\B>";
        System.out.println(text);
        text = text.replaceAll("<.*?>", "");
        System.out.println(text);
    }
}

class StringLineCounter {
    public static void main(String[] args) {
        String str = "line1\nline2\nline3\rline4";
        System.out.println(str);
        System.out.println(Arrays.toString(str.split("[\n|\r]")));
        int count = getStringLineCount(str);
        System.out.println("Line count:" + count);
    }

    public static int getStringLineCount(String text) {
        return text.split("[\n|\r]").length;
    }
}