import java.util.PriorityQueue;

public class P12 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(89);
		pq.add(82);
		pq.add(70);
		pq.add(25);
		pq.add(16);
		pq.add(22);
		pq.add(36);
		pq.add(10);
		pq.add(14);
		
		System.out.println("Original Priority Queue: "+pq);
		
		
		

	}

}
//Test input:
//[89, 82, 70, 25, 16, 22, 36, 10, 14]
//
//
//Sample Output:Original Priority Queue: [89, 82, 70, 25, 16, 22, 36, 10, 14]
//Maximum Priority Queue: 89 82 70 36 25 22 16 14 10