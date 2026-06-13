/*
. Virtual Threads (Java 21) 
• Objective: Use lightweight threads for scalable concurrency. 
• Task: Launch 100,000 virtual threads that each print a message. 
• Instructions: 
o Use Thread.startVirtualThread(() -> { ... }). 
o Measure performance versus traditional threads.
*/
public class VirtualThreadDemo {

    public static void main(String[] args)
            throws InterruptedException {

        long start = System.currentTimeMillis();

        for (int i = 1; i <= 100_000; i++) {

            int id = i;

            Thread.startVirtualThread(() -> {
                System.out.println(
                        "Virtual Thread " + id);
            });
        }

        Thread.sleep(3000);

        long end = System.currentTimeMillis();

        System.out.println(
                "Time Taken: " + (end - start) + " ms");
    }
}