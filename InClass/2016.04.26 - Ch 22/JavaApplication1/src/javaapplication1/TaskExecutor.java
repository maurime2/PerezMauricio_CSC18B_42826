package javaapplication1;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class TaskExecutor
{
   public static void main(String[] args)
   {
      // create and name each runnable
      PrintTask task1 = new PrintTask("task1");
      PrintTask task2 = new PrintTask("task2");
      PrintTask task3 = new PrintTask("task3");
      PrintTask task4 = new PrintTask("task4");
      PrintTask task5 = new PrintTask("task5");
      PrintTask task6 = new PrintTask("task6");
      
      System.out.println("Starting Executor");

      // create ExecutorService to manage threads
      
      ExecutorService executorService1 = Executors.newSingleThreadExecutor();
      ExecutorService executorService2 = Executors.newSingleThreadExecutor();
      ExecutorService executorService3 = Executors.newSingleThreadExecutor();
      ExecutorService executorService4 = Executors.newSingleThreadExecutor();
      ExecutorService executorService5 = Executors.newSingleThreadExecutor();
      ExecutorService executorService6 = Executors.newSingleThreadExecutor();
      
      // start the three PrintTasks
      executorService1.execute(task1); // start task1	
      executorService2.execute(task2); // start task2
      executorService3.execute(task3); // start task3
      executorService4.execute(task4); // start task4	
      executorService5.execute(task5); // start task5
      executorService6.execute(task6); // start task6
      
      // shut down ExecutorService--it decides when to shut down threads
      executorService1.shutdown();
      executorService2.shutdown();
      executorService3.shutdown();
      executorService4.shutdown();
      executorService5.shutdown();
      executorService6.shutdown();

      System.out.printf("Tasks started, main ends.%n%n");
   } 
} // end class TaskExecutor