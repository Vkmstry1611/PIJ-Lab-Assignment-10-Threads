// Name: Vidish Ketankumar Mistry
// PRN: 23070126146
// Batch: B3

public class Main {
    public static void main(String[] args) {
        // Creating and starting two threads with different behavior
        MyThread thread1 = new MyThread(1, 3, 3000);       // Starts from 1, adds 3 every 3 sec
        MyThread thread2 = new MyThread(100, 50, 1000);    // Starts from 100, adds 50 every 1 sec

        thread1.start();
        thread2.start();
    }
}
