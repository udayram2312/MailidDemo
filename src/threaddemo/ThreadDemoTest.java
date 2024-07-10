package threaddemo;

public class ThreadDemoTest {
    public static void main(String[] args){
        Thread thread1 = Thread.currentThread();
        Thread.currentThread().setName("uday");

      String threadName = Thread.currentThread().getName();
        System.out.println(thread1.getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());


        Thread countThread1 = new NumberCountThread();
        countThread1.setName("Count Thread-1");
        countThread1.setPriority(1);
        countThread1.start();


        Thread countThread2 = new NumberCountThread();
        countThread2.setName("Count Thread-2");
        countThread2.setPriority(5);
        countThread2.start();

        Thread countThread3 = new NumberCountThread();
        countThread3.setName("Count Thread-3");
        countThread3.setPriority(10);
        countThread3.start();


    }
}
