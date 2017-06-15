import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Tallmonitor monitor = new Tallmonitor();
        Oppover oppover = new Oppover(monitor);
        Nedover nedover = new Nedover(monitor);
        Thread oppoverThr = new Thread(oppover);
        Thread nedoverThr = new Thread(nedover);
        oppoverThr.start();
        nedoverThr.start();
    }
}

class Tallmonitor {

    private final Lock lock = new ReentrantLock();
    int detMinste;
    int detStorste;

    public boolean settMinste() {
        lock.lock();
        try {
            detMinste += 1;
            if (detMinste < detStorste) {
                return true;
            } else {
                System.out.println(detMinste);
                return false;
            }
        } finally {
            lock.unlock();
        }
    } 

    public boolean settStorste() {
        lock.lock();
        try {
            detStorste -= 1;
            if (detMinste < detStorste) {
                return true;
            } else {
                System.out.println(detStorste);
                return false;
            }
        } finally {
            lock.unlock();
        }
    }

    public int hentStorste() {
        return detStorste;
    }

    public int hentMinste() {
        return detMinste;
    }
}

class Nedover implements Runnable {
    Tallmonitor monitor;
    int detStorste;
    boolean go;

    Nedover(Tallmonitor monitor) {
        go = true;
        detStorste = Integer.MAX_VALUE;
        this.monitor = monitor;
    }

    public void run() {
//        try {
            while(go) {
                go = monitor.settStorste();
                detStorste = monitor.hentStorste();
            }
//        } catch (InterruptedException exception) {}
    }
}

class Oppover implements Runnable {
    Tallmonitor monitor;
    int detMinste;
    boolean go;

    Oppover(Tallmonitor monitor) {
        go = true;
        detMinste = Integer.MIN_VALUE; 
        this.monitor = monitor;
    }

    public void run() {
//        try {
            while(go) {
                go = monitor.settMinste();
                detMinste = monitor.hentMinste();
            }
//        } catch (InterruptedException exception) {}
    }
}

