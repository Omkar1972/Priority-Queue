import java.util.PriorityQueue;

public class P8 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(10);
		pq.add(14);
		pq.add(36);
		pq.add(16);
		pq.add(22);
		pq.add(70);
		pq.add(82);
		pq.add(89);
		pq.add(25);
		
		System.out.println("Original Priority Queue: "+pq);
		
		
		
		System.out.println("The first element of the Queue: "+pq.peek());
		
		
		

	}

}
//Test input:
//[10, 14, 36, 16, 22, 70, 82, 89, 25]
//
//
//Sample Output:
//Original Priority Queue: [10, 14, 36, 16, 22, 70, 82, 89, 25]
//The first element of the Queue: 10