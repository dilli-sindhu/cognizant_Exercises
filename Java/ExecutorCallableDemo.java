/*
 Executor Service and Callable 
• Objective: Use concurrency utilities. 
• Task: Execute multiple Callable tasks that return results. 
• Instructions: 
o Use Executors.newFixedThreadPool() and submit() to execute callables. 
o Collect results using Future.get().
*/
import java.util.concurrent.*;

public class ExecutorCallableDemo {

    public static void main(String[] args)
            throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        Callable<String> task1 =
                () -> "Task 1 Completed";

        Callable<String> task2 =
                () -> "Task 2 Completed";

        Callable<String> task3 =
                () -> "Task 3 Completed";

        Future<String> f1 =
                executor.submit(task1);

        Future<String> f2 =
                executor.submit(task2);

        Future<String> f3 =
                executor.submit(task3);

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());

        executor.shutdown();
    }
}