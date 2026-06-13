/*
 Thread Creation 
• Objective: Implement multithreading. 
• Task: Create and run two threads that print messages. 
• Instructions: 
o Define a class that extends Thread or implements Runnable. 
o In the run() method, print a message multiple times. 
o Start both threads and observe the output. 
*/
class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
        }
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1 Running");
        MyThread t2 = new MyThread("Thread 2 Running");

        t1.start();
        t2.start();
    }
}