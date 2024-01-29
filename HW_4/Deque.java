
public class Deque<T> implements DequeInterface<T>
{
	protected LLNode<T> front;     // reference to the front of this queue
	protected LLNode<T> rear;      // reference to the rear of this queue
	protected int numElements = 0; // number of elements in this queue
	
	public Deque() 
	  {
			front = null;
			rear = null;
	  }

	@Override
	public void enqueueFront(T element) throws QueueOverflowException 
	{
		LLNode<T> newNode = new LLNode<T>(element);
		if (front == null)
		{
			front = rear = newNode;
		}
		
		else
		{
			newNode.setLink(front);
			front = newNode;
		}
		numElements++;
	}

	@Override
	public void enqueueRear(T element) throws QueueOverflowException 
	{
		LLNode<T> newNode = new LLNode<T>(element);
		
		if(rear==null)
		{
			front = rear = newNode;
		}
		else
		{
			rear.setLink(newNode);
			rear = newNode;
		}
		numElements++;
	}

	@Override
	public T dequeueFront() throws QueueUnderflowException
	{
		if(isEmpty())
		{
			throw new QueueUnderflowException("underflow exception");
		}	
		T element = front.getInfo();
		if(front.getLink() != null)
		{
			front = front.getLink();
			numElements--;
			return element;
		}
		else
		{
			front = null;
			numElements--;
			return element;
		}		
	}

	@Override
	public T dequeueRear() throws QueueUnderflowException 
	{
		if(isEmpty())
		{
			throw new QueueUnderflowException("underflow exception");		
		}
	
		T element = rear.getInfo();
		
		LLNode<T> tmp = front;
		if(tmp.getLink() != null)
		{
			while(tmp.getLink() != rear)
			{
				tmp = tmp.getLink();
			}
			rear = tmp;
			rear.setLink(null);
			numElements--;
			return element;	
		}
		else
		{
			front = null;
			numElements--;
			return element;
		}
		
		
	}

	@Override
	public boolean isFull() 
	{
		
		return false;
	}

	@Override
	public boolean isEmpty() 
	{
		return (numElements == 0);
	}

	@Override
	public int size() 
	{
		
		return numElements;
	}
	
	// method to check the front element of the queue
	public T peekAtFront() throws QueueUnderflowException
	{
		if(isEmpty())
		throw new QueueUnderflowException("underflow exception");
		return front.getInfo();
	}
	
	// method to check the end element of the queue
	public T peekAtRear()
	{
		if(isEmpty())
		throw new QueueUnderflowException("underflow exception");
		return rear.getInfo();
	}
}
