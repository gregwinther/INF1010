import java.util.Date;

/** 
A runnable that repeatedly prints a greeting.
*/

public class GreetingRunnable implements Runnable {
    private static final int REPETITIONS = 10;
    private static final int DELAY = 1000; // milliseconds

    private String greeting;

    /**
        Constructs runnable object.
        @param aGreeting the greeing to display
    */

    public GreetingRunnable(String aGreeting) {
        this.greeting = aGreeting;
    }

    // Here the Runnable interface overriding happens
    public void run() {
        try {
            for (int i = 0; i <= REPETITIONS; i++) {
                Date now = new Date();
                System.out.println(now + " " + greeting);
                Thread.sleep(DELAY);
            }
        }
        catch (InterruptedException exception) {}
    }
}