import java.util.PriorityQueue;

public class P9 {

	public static void main(String[] args) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	
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
	
	System.out.println("Removes the first element: "+pq.poll());
	
	System.out.println("Priority Queue after removing first element: "+pq);
	
	}

}
//Test input:
//[10, 14, 36, 16, 22, 70, 82, 89, 25]
//
//
//Sample Output:Original Priority Queue: [10, 14, 36, 16, 22, 70, 82, 89, 25]
//Removes the first element: 10
//Priority Queue after removing first element: [14, 16, 36, 25, 22, 70, 8
//2, 89]