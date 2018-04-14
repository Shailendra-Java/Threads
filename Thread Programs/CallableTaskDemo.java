import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class Task implements Callable {
    
    String taskname;
    public Task(String name)
    {
    taskname = name;
    }
      public String call() 
{
      System.out.println("The task name is " +taskname +" executed by " +Thread.currentThread().getName());
      return taskname;
    }
}
public class CallableTaskDemo {
    public static void main(String a[]) 
    {
      Task task1 = new Task("Task1");
      Task task2 = new Task("Task2");
      Task task3 = new Task("Task3");
    ExecutorService threadexecutorPool1 = Executors.newFixedThreadPool(3);
    ExecutorService threadexecutorPool2 = Executors.newFixedThreadPool(3);
    Future<String> f1=threadexecutorPool1.submit(task1);
    Future<String> f2=threadexecutorPool2.submit(task2);
    Future<String> f3=threadexecutorPool2.submit(task3);
      
    }
}
