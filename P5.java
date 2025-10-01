import java.util.PriorityQueue;

public class P5 {

	public static void main(String[] args) {
        PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("Black");
		pq.add("Red");
		pq.add("Green");
		pq.add("White");
		
		System.out.println("Original Priority Queue: "+pq);
		
		pq.removeAll(pq);
		
		System.out.println("The New Priority Queue: "+pq);
		
	}

}
//Test input:
//[Black, Red, Green, White]
//
//
//Sample Output:Original Priority Queue: [Black, Red, Green, White]
//The New Priority Queue: []