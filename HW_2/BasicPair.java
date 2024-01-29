
public class BasicPair<T> implements PairInterface<T>
{
	//two objects of type T

	private T first;

	private T second;

	//constructor taking values for the pair

	public BasicPair(T first, T second) {

	this.first = first;

	this.second = second;

	}

	@Override

	public T getFirst() {

	return first;

	}

	@Override

	public T getSecond() {

	return second;

	}

	@Override

	public void setFirst(T element) {

	first = element;

	}

	@Override

	public void setSecond(T element) {

	second = element;

	}
}
