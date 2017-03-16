package fundamental;

import java.util.ArrayList;
import java.util.List;

/**
 * 静态方法,静态变量
 * Created by yangyang on 16/1/21.
 */
public class StaticMethod {
    private String name;
    private static String staticStr = "STATIC-STRING";

    public StaticMethod(String name) {
        this.name = name;
    }

    public static void testStaticMethod() {
        System.out.println("Hey... I am in static method...");
        System.out.println(StaticMethod.staticStr);

    }

    public void testObjectMethod() {
        System.out.println("Hey i am in non-static method");
        System.out.println(StaticMethod.staticStr);
        System.out.println("Name:" + this.name);

    }

    public static void main(String[] args) {
        StaticMethod.testStaticMethod();
        StaticMethod staticMethod = new StaticMethod("yangyang");
        staticMethod.testObjectMethod();
    }
}

/**
 * 静态块
 */
class StaticBlock {
    private static List<String> list;

    static {
        list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
    }

    public void testList() {
        System.out.println(list);
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        sb.testList();
    }
}

/**
 * 静态块和构造器
 */

class StaticAndConstructor {
    static {
        System.out.println("I am in static block.");
        System.out.println("Static block will be called first than constructor!!!");
        System.out.println("Static block will be called only once.");
    }

    public StaticAndConstructor(){
        System.out.println("I am in constructor.");
    }

    public static void main(String[] args) {
        StaticAndConstructor ksv1 = new StaticAndConstructor();
        StaticAndConstructor ksv2 = new StaticAndConstructor();
        StaticAndConstructor ksv3 = new StaticAndConstructor();
        StaticAndConstructor ksv4 = new StaticAndConstructor();

    }
}

class StaticSingleton{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.testSingleton();
    }
}

/**
 * 单例模式
 */
class Singleton{

    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    private Singleton(){
        System.out.println("Creating MySingleton object...");
    }
    public static Singleton getInstance(){
        return instance;
    }
    public void testSingleton(){
        System.out.println("Hey.... Instance got created...");
    }
}

