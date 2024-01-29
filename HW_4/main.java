import java.util.Random;

public class main {

	public static void main(String[] args) 
	{
		Deque<Integer> dq = new Deque<>();
		
		dq.enqueueFront(1);  
		dq.enqueueFront(2);
		dq.enqueueFront(3);
		dq.enqueueFront(4);
		dq.enqueueRear(7);
		dq.enqueueRear(8);
		dq.enqueueRear(9);
		dq.enqueueRear(10);
		//4 3 2 1 7 8 9 10
		
		for(int i = 0; i < 8; i++)
		{
			System.out.print(dq.dequeueFront() + " ");
		}
		
		System.out.println();
		
		dq.enqueueFront(1);  
		dq.enqueueFront(2);
		dq.enqueueFront(3);
		dq.enqueueFront(4);
		dq.enqueueRear(7);
		dq.enqueueRear(8);
		dq.enqueueRear(9);
		dq.enqueueRear(10);
		//4 3 2 1 7 8 9 10
		
		for(int i = 0; i < 8; i++)
		{
			System.out.print(dq.dequeueRear() + " ");
		}
		
		System.out.println();
		
		dq.enqueueFront(1);
		dq.enqueueRear(0);
		
		System.out.println(dq.peekAtFront());
		System.out.println(dq.peekAtRear());
		System.out.println(dq.size());
		System.out.println(dq.isEmpty());
		
		
		
		

	}

}
