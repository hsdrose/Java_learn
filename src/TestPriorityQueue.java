import java.util.PriorityQueue;


public class TestPriorityQueue
{

	public static void main(String[] args)
	{
	   PriorityQueue  pq=new PriorityQueue();
	   pq.offer(6);
	   pq.offer(-3);
	   pq.offer(9);
      pq.offer(10);
      System.out.println(pq);
      System.out.println(pq.peek());
      System.out.println(pq.poll());
      System.out.println(pq);
	}

}
