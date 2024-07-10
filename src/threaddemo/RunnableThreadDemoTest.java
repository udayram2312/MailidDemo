package threaddemo;

public class RunnableThreadDemoTest {

    public static void main(String[] args) {
        Runnable numberCountRunnable = new NumberCountRunnableThread();
        Thread thread = new Thread(numberCountRunnable,"RunnableThtread-1");
        thread.start();





    }
}
