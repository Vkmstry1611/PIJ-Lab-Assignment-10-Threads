# Multi-threaded Incrementing Program

## Overview
This Java program demonstrates the use of **multi-threading** by creating two threads that perform incrementing operations. Each thread prints its current value, increments it by a specified amount, and then pauses for a specified delay before repeating the operation.

The program uses two primary classes:
- **`Main.java`**: The entry point that starts the threads.
- **`MyThread.java`**: A custom thread class that performs the increment operation.

## Classes and Methods

### 1. Main.java
The `Main` class is the entry point to the program, which creates and starts two separate threads (`MyThread` objects) with different initial values, increment steps, and delays.

#### Methods
- **`public static void main(String[] args)`**:
  - This method is executed when the program starts. It creates two instances of the `MyThread` class with different initialization parameters and starts them.
    - **`new MyThread(1, 3, 3000).start();`** – Starts a thread that begins from `1`, increments by `3` every `3000` milliseconds (3 seconds).
    - **`new MyThread(100, 50, 1000).start();`** – Starts a thread that begins from `100`, increments by `50` every `1000` milliseconds (1 second).

---

### 2. MyThread.java
The `MyThread` class extends the `Thread` class and is responsible for performing an operation in a separate thread. This class continuously increments a value, prints it, and pauses for a specified duration before repeating the process.

#### Fields
- **`private int currentValue;`** – Stores the current value being printed and incremented.
- **`private final int incrementStep;`** – The value by which `currentValue` is incremented.
- **`private final int delayInMillis;`** – The duration (in milliseconds) that the thread will sleep after each operation.

#### Constructor
- **`public MyThread(int init, int increment, int delay)`**:
  - Initializes the thread with an initial value (`init`), the increment step (`increment`), and the delay between operations (`delay`).
  - **`currentValue = init;`** – Sets the starting value.
  - **`incrementStep = increment;`** – Sets the increment value.
  - **`delayInMillis = delay;`** – Sets the delay between operations.

#### Methods

- **`private void performIncrementOperation()`**:
  - This method contains the logic that the thread repeatedly executes.
  - It prints the `currentValue`, increments it by the `incrementStep`, and then pauses for `delayInMillis` milliseconds.
  - It keeps running in an infinite loop (`while (true)`) until the thread is interrupted.
  - If an interruption occurs, it prints a message and stops the loop.

- **`@Override public void run()`**:
  - This method is overridden from the `Thread` class.
  - When a thread is started by calling `thread.start()`, it calls the `run()` method, which in turn calls `performIncrementOperation()`, beginning the thread’s execution.
