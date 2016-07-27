import org.junit.Test;

/**
 * Main
 *
 * @author yangyang
 * @create 16/7/27 18:39
 * @function
 */
public class Main {
    @Test
    public void testThread(){
        MyThread myThread = new MyThread();
        myThread.start();
    }

    @Test
    public void testThread1(){
        Thread thread =new Thread(){
            @Override
            public void run(){
                System.out.println("Thread running");
            }
        };
        thread.start();
    }

    @Test
    public void testRunnable(){
        MyRunnable myRunnable = new MyRunnable();
        myRunnable.run();
    }

    @Test
    public void testRunnable1(){
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Runnable running...");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
