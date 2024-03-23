class InterruptedThread extends Thread {

    public void run() {
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

public class InterruptedExceptionTest {

    public static void main(String[] args) {
        InterruptedThread sleepingthread = new InterruptedThread();
        sleepingthread.start();
        sleepingthread.interrupt();
    }
}
