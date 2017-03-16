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

    @Test
    public void testThreadName(){
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "new thread");
        thread.start();
        System.out.println(thread.getName());
        System.out.println(Thread.currentThread().getName());
    }

    @Test
    public void testThread3(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i<10;i++){
            new Thread(""+i){
              public void run(){
                  System.out.println("Thread:"+getName()+" running...");
              }
            }.start();
        }

    }
}
