/**
 * protected的成员在该类及其衍生类中可见
 * Created by yangyang on 16/1/13.
 */
public class Woman extends Human {
    public Woman(int h) {
        super(h);
    }

    public Human giveBirth() {

        System.out.println("Give birth");
        return (new Human(20));
    }

    public static void main(String[] args) {
        Woman aWoman = new Woman(10);
        aWoman.growHeight(120);
        Human human = aWoman.giveBirth();
        System.out.println(human.getHeight());
        System.out.println(aWoman.getHeight());
    }
}
