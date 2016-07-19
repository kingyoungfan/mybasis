/**
 * java泛型
 * Created by yangyang on 16/4/9.
 */
public class Generic<T> {
    private T ob;//定义泛型成员变量

    /**
     * 构造器,构造方法,初始化对象
     * @param ob 泛型变量
     */
    public Generic(T ob) {
        System.out.println("******ob=" + ob);
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public void showType() {
        System.out.println("T的实际类型是" + ob.getClass().getName());
    }
}

class GenDom {
    public static void main(String[] args) {
        //定义泛型类的一个Integer类型
        Generic<Integer> intOb = new Generic<>(2);
        intOb.showType();
        int i = intOb.getOb();
        System.out.println("value i = " + i);
        System.out.println("*********");
        Generic<String> strOb = new Generic<>("yangyang");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value s = " + s);
    }
}
