/**
 * Created by yangyang on 16/4/3.
 */
public class thread {

}

class MyRunnable implements Runnable {

    public static int myCount = 0;

    public MyRunnable() {

    }

    @Override
    public void run() {
        while (MyRunnable.myCount <= 10) {
            try {
                System.out.println("Exp1 Thread: " + (++MyRunnable.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println();
            }
        }
    }
}

class RunMyThread {
    public static void main(String[] args) {
        System.out.println("Starting Main Thread...");
        MyRunnable mr = new MyRunnable();
        Thread thread = new Thread(mr);
        thread.start();
        while (MyRunnable.myCount <= 10) {
            try {
                System.out.println("Main Thread +" + (++MyRunnable.myCount));
                Thread.sleep(100);
            } catch (InterruptedException i) {
                System.out.println(i.getMessage());
            }
        }
        System.out.println("End Of Main Thread...");
    }
}

