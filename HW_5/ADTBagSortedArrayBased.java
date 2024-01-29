import java.util.Arrays;
import java.util.Random;

public class ADTBagSortedArrayBased<T> implements BagInterface<T>
{
	  protected final int DEFCAP = 100; // default capacity
	  protected int origCap;            // original capacity
	  public T[] elements;           // array to hold collection elements
	  protected int numElements = 0;    // number of elements in this collection

	  // set by find method
	  public boolean found;  // true if target found, otherwise false
	  protected int location;   // indicates location of target if found,
	  							// indicates add index if not found
	  
	  public ADTBagSortedArrayBased() 
	  {
	    elements = (T[]) new Object[DEFCAP];
	    origCap = DEFCAP;
	  }

	  public ADTBagSortedArrayBased(int capacity) 
	  {
	    elements = (T[]) new Object[capacity];
	    this.origCap = capacity;
	  }
	  
	  protected void enlarge()
	  // Increments the capacity of the collection by an amount 
	  // equal to the original capacity.
	  {
	    // Create the larger array.
	    T[] larger = (T[]) new Object[elements.length + origCap];
	    
	    // Copy the contents from the smaller array into the larger array.
	    for (int i = 0; i < numElements; i++)
	    {
	      larger[i] = elements[i];
	    }
	    
	    // Reassign elements reference.
	    elements = larger;
	  }
	  
	  protected void find(java.lang.Object element)
	  // Searches elements for an occurrence of an element e such that
	  // e.equals(target). If successful, sets instance variables
	  // found to true and location to the array index of e. If
	  // not successful, sets found to false and location to the 
	  // array index where target should be inserted.
	  {
	    location = 0;
	    found = false;
	    if (!isEmpty())
	       recFind(element, 0, numElements - 1);
	  }
	  
	  protected void recFind(java.lang.Object element, int first, int last)
	  // Used by find.
	  {
	    int result;       // result of the comparison
	    if (first > last)
	    {
	      found = false;
	      result = ((Comparable)element).compareTo(elements[location]);
	      if (result > 0)
	         location++;    // adjust location to indicate insert index
	    }
	    else
	    {
	      location = (first + last) / 2;
	      result = ((Comparable)element).compareTo(elements[location]);
	      if (result == 0)  // found target
	        found = true;
	      else
	      if (result > 0)   // target too high
	        recFind(element, location + 1, last);
	      else               // target too low
	        recFind(element, first, location - 1);
	     }
	  }

	@Override
	public boolean add(java.lang.Object element) 
	{
		if (numElements == elements.length)
		      enlarge();

		    find(element); // sets location to index where element belongs
		    
		    for (int index = numElements; index > location; index--)
		      elements[index] = elements[index - 1];

		    elements[location] = (T) element;
		    numElements++;
		    return true;
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
		        for (int i = location; i <= numElements - 2; i++)
		            elements[i] = elements[i+1];
		          elements[numElements - 1] = null;
		          numElements--;
		    }
		    return found;
	}

	@Override
	public boolean isFull() 
	{
		// This collection is unbounded so always returns false.
		return false;
	}

	@Override
	public boolean isEmpty() 
	{
		 // Returns true if this collection is empty; otherwise, returns false.
		 return (numElements == 0);
	}

	@Override
	public int size() 
	{
		  // Returns the number of elements on this collection. 
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
			remove(elements[randIndex]);
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
		while(found)
		{
			remove(target);
			if(found)
			count++;
		}
		return count;
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
