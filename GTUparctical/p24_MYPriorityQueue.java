import java.util.PriorityQueue;
public class p24_MYPriorityQueue
{
    public static void main(String[] args)
    {
        MyPriorityQueue<String> queue = new MyPriorityQueue<>();
        queue.offer("10");
        queue.offer("20");
        queue.offer("30");
        MyPriorityQueue<String> queue1 = null;
        try
        {
            queue1 = (MyPriorityQueue<String>)(queue.clone());
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        System.out.print(queue1);
 }
    static class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable
    {
        @Override
        public Object clone() throws CloneNotSupportedException
        {
            MyPriorityQueue<E> clone = new MyPriorityQueue<>();
            this.forEach(clone::offer);
            return clone;
        }
    }
}


