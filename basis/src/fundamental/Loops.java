package fundamental;

import java.util.ArrayList;
import java.util.List;

/**
 * 循环
 * Created by yangyang on 16/1/22.
 */
public class Loops {
    private static List<String> l;
    public static void main(String[] args) {
        System.out.println(args.length);

        Object s = "abc";
        List<Object> list = (List<Object>) s;
        System.out.println(list.toString());
    }
}

class SimpleWhileEx {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i + " ");
            i++;
        }
    }
}

class SimpleDoWhileEx {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i + " ");
            i++;
        } while (i < 10);
    }
}

class SimpleForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= 10; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}

class SimpleForEachEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        for (String s : list) {
            System.out.println(s);
        }
    }
}

/**
 * break会调出循环
 */
class SimpleBreakEx {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("breaking the for loop...");
                break;
            }
            System.out.println(i);
        }
    }
}

/**
 * continue不会终止程序
 */
class SimpleContinueEx {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i+"    ");
                continue;
            }
            System.out.println(i);
        }
    }
}