public class ArrayPair<T> implements PairInterface<T> 
{

	// array of type T to store pair
	
	private T[] elements;
	
	// constructor taking values for the pair
	
	public ArrayPair(T first, T second) {
	
	// since we cannot instantiate generic array, we create Object type
	
	// array of capacity = 2, and cast it to T[]
	
	elements = (T[]) new Object[2];
	
	//adding first to index 0 and second to index 1
	
	elements[0] = first;
	
	elements[1] = second;
	
	}
	
	@Override
	
	public T getFirst() {
	
	return elements[0];
	
	}
	
	@Override
	
	public T getSecond() {
	
	return elements[1];
	
	}
	
	@Override
	
	public void setFirst(T element) {
	
	elements[0] = element;
	
	}
	
	@Override
	
	public void setSecond(T element) {
	
	elements[1] = element;
	
	}
}
