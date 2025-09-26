import java.util.PriorityQueue;

public class P1 {

	public static void main(String[] args) {
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("Black");
		pq.add("Green");
		pq.add("Orange");
		pq.add("White");
		pq.add("Red");
		
		System.out.println("Elements of the Priority Queue:"+pq);
		
		

	}

}
//Test input:
//[Black, Green, Orange, White, Red] 
//
//
//Sample Output:Elements of the Priority Queue:
//[Black, Green, Orange, White, Red]