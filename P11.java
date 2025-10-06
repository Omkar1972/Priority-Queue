import java.util.PriorityQueue;

public class P11 {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<>();
		
		pq.add("Black");
		pq.add("Red");
		pq.add("Green");
		pq.add("White");
		
		System.out.println("Original Priority Queue: "+pq);
		
		String s=pq.toString();
		
		System.out.println("String representation of the Priority Queue: "+pq);

	}

}
//Test input:
//[Black, Red, Green, White]
//
//
//Sample Output:
//Original Priority Queue: [Black, Red, Green, White]
//String representation of the Priority Queue: [Black, Red, Green, White]