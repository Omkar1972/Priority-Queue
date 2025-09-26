import java.util.PriorityQueue;

public class P2 {

	public static void main(String[] args) {
      PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("Black");
		pq.add("Green");
		pq.add("Orange");
		pq.add("White");
		pq.add("Red");
		
		System.out.println("Elements of the Priority Queue:"+pq);
		
		for(int i=0;i<5;i++)
		{
			System.out.println();
		}
		

	}

}
