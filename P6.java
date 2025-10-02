import java.util.PriorityQueue;

public class P6 {

	public static void main(String[] args) {
		  PriorityQueue<String> pq=new PriorityQueue<String>();
		  
		  pq.add("Black");
		  pq.add("Pink");
		  pq.add("Green");
		  pq.add("Red");
		  pq.add("orange");
		  
		  System.out.println("Priority Queue: "+pq);
		  
		  
		  System.out.println("Size of the Priority Queue: "+pq.size());
		  
	}

}
//Test input:
//[Black, Pink, Green, Red, orange]
//
//
//Sample Output:Priority Queue: [Black, Pink, Green, Red, orange]
//Size of the Priority Queue: 5