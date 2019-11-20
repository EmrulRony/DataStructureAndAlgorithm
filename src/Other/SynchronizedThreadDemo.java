package Other;

class Display {
    public synchronized void wish(String name) {
        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello " + name);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Mythread extends Thread {
    Display display;
    String name;

    public Mythread(Display display, String name) {
        this.display = display;
        this.name = name;
    }

    public void run() {
        display.wish(name);
    }
}

public class SynchronizedThreadDemo {
    public static void main(String[] args) {
        Display display = new Display();
        Mythread th = new Mythread(display, "Emrul");
        Mythread th1 = new Mythread(display, "Hasan");
        th1.run();
        th.run();
    }
}