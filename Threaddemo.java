
class NewThread extends Thread {
    NewThread() {
        super("Demo Thread");
        System.out.println("Child thread : " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");

        }
        System.out.println("Exiting child thread");
    }
}

public class Threaddemo {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("main thread:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("main thread inrerupted.");

        }
        System.out.println("main thread exiting");
    }

}
