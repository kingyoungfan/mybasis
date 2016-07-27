/**
 *
 * Created by yangyang on 16/1/13.
 */
public class Human {
    private int height;

    public Human(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void growHeight(int h) {
        this.height = this.height + h;
    }
}
