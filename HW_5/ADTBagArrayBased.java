import java.util.Random;

public class ADTBagArrayBased<T> implements BagInterface<T>
{
	protected final int DEFCAP = 15; // default capacity
	protected T[] elements;           // array to hold collection�s elements
	protected int numElements = 0;    // number of elements in this collection
	protected boolean found;  // true if target found, otherwise false
	protected int location;   // indicates location of target if found
	
	public ADTBagArrayBased() 
	  {
	    elements = (T[]) new Object[DEFCAP];
	  }
  
	public ADTBagArrayBased(int capacity) 
	  {
	    elements = (T[]) new Object[capacity];
	  }
	
	protected void find(java.lang.Object target)
	  {
	    location = 0;
	    found = false;
	    while (location < numElements)
	    {
	      if (elements[location].toString().equals(target.toString()))
	      {  
	        found = true;
	        return;
	      }
	      else
	        location++;
	    }
	  }

	@Override
	public boolean add(java.lang.Object element) 
	{
		// Attempts to add element to this collection.
	    // Returns true if successful, false otherwise.  
	    if (isFull())
	      return false;
	    else
	    {
	      elements[numElements] = (T) element;
	      numElements++;
	      return true;
	    }
	}

	@Override
	public java.lang.Object get(java.lang.Object target) 
	{
		// Returns an element e from this collection such that e.equals(target);
	    // if no such element exists, returns null.  
	    find(target);    
	    if (found)
	      return elements[location];
	    else
	      return null;
	}

	@Override
	public boolean contains(java.lang.Object target) 
	{
		// Returns true if this collection contains an element e such that 
		// e.equals(target); otherwise, returns false.
		find(target);
		return found;
	}

	@Override
	public boolean remove(java.lang.Object target) 
	{
		// Removes an element e from this collection such that e.equals(target)
		// and returns true; if no such element exists, returns false.
	    find(target);    
	    if (found)
	    {
	      elements[location] = elements[numElements - 1];
	      elements[numElements - 1] = null;
	      numElements--;  
	    }
	    return found;
	}

	@Override
	public boolean isFull() 
	{
		return (numElements == elements.length);
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

	@Override
	public T grab() 
	{
		Random rand = new Random();
		if(numElements==0)
		{
			  //arrays is empty
			  return null;
		}
		else
		{
			int randIndex = rand.nextInt(numElements);
			T tempElement = elements[randIndex];
			elements[randIndex] = elements[numElements - 1];
		    elements[numElements - 1] = null;
		    numElements--;
		    return tempElement;
		}
	}

	@Override
	public int count(T target) 
	{
		int count=0;
		  if(numElements==0)
		  {
			  //arrays is empty
			  return count;
		  }
		  else
		  {
			  for( location=0;location<numElements;location++)
			  {
				  if(elements[location].toString().equals(target.toString()))
				  {
					  count++;
				  }
			  }
		  return count;
		  }
	}

	@Override
	public int removeAll(T target) 
	{
		 int count = 0;
		  
		  if(numElements==0)
		  {
			  //arrays is empty
			  return count;
		  }
		  else
		  {
			  for( location = 0; location < numElements; location++)
			  {
				if(elements[location].toString().equals(target.toString()))
				{
					while(elements[numElements -1].toString().equals(target.toString()))
					{
						elements[numElements - 1] = null;
						numElements--;
						count++;
						if(numElements == 0)
						{
							return count;
						}		
					}
					if(location < numElements-1)
					{
						elements[location] = elements[numElements - 1];
						elements[numElements - 1] = null;
						numElements--;	
						count++;
					}	
				}
			  }
			  return count;
		  	}
	}

	@Override
	public void clear() 
	{
		for(int i = 0; i < elements.length; i++)
		{
			elements[i] = null;
		}
		numElements = 0;
	}
}
