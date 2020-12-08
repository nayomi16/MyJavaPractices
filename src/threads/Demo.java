package threads;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        MyThread myThread = new MyThread();
        /*Thread thread = new Thread(myThread);
        thread.start();*/
        myThread.start();

        for (int i=0; i<40; i++){
            System.out.println(i+" main thread");
        }

        System.out.println("main end");


    }
}
