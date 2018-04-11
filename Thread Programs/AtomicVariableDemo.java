import java.util.concurrent.atomic.AtomicInteger;
public class AtomicVariableDemo 
{
    public static void main(String a[]) 
    {
        AtomicInteger value = new AtomicInteger(5);
        System.out.println("Intial value: " + value.get());
        value.getAndIncrement();
        System.out.println("After incrementing, the value: " + value.get());
        value.set(40);
        System.out.println("After setting, the value: " + value.get());
        value.getAndDecrement();
        System.out.println("After decrementing, the value: " + value.get());
        value.compareAndSet(39, 45);
        System.out.println("After updating, the value: " + value.get());
    }
}
