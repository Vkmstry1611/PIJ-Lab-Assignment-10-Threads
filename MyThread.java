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

    
    // Method that performs the increment operation in a loop
    private void performIncrementOperation() {
        while (true) {
            try {
                // Printing current value
                System.out.println("Thread " + getName() + ": " + currentValue);

                // Incrementing value
                currentValue += incrementStep;

                // Sleeping for specified delay
                Thread.sleep(delayInMillis);
            } catch (InterruptedException e) {
                // Handling interruption
                System.out.println("Thread " + getName() + " interrupted.");
                break; // Exit loop if interrupted
            }
        }
    }

    // Overridden run method where thread execution begins
    @Override
    public void run() {
        performIncrementOperation();
    }

}