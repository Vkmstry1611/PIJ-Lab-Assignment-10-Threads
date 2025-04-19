// Thread class to repeatedly increment and print a value

public class MyThread extends Thread {
    private int currentValue;
    private final int incrementStep;
    private final int delayInMillis;

    // Constructor to initialize thread parameters
    public MyThread(int init, int increment, int delay) {
        this.currentValue = init;
        this.incrementStep = increment;
        this.delayInMillis = delay;
    }

    

}