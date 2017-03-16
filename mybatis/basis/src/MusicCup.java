/**
 * 类MusicCup实现了Cup接口
 * Created by yangyang on 16/1/13.
 */
public class MusicCup implements Cup, MusicPlayer {
    private int water = 0;
    MusicCup(int water){
        this.water = water;
    }
    public void addWater(int w) {
        this.water = this.water + w;
    }

    public void drinkWater(int w) {
        this.water = this.water - w;
    }

    public void play() {
        System.out.println("la...la...la");

    }

    public int getWater() {
        return this.water;
    }
    public static void main(String[] args){
        MusicCup mc = new MusicCup(10);
        mc.play();
        System.out.println(mc.getClass());
        System.out.println(mc.getWater());
        mc.addWater(2);
        System.out.println(mc.getWater());
        mc.drinkWater(3);
        System.out.println(mc.getWater());

    }
}
