import java.util.Arrays;

public class ArrayCollection<T> implements CollectionInterface<T>  
{
  protected final int DEFCAP = 100; // default capacity
  protected T[] elements;           // array to hold collection�s elements
  protected int numElements = 0;    // number of elements in this collection

  // set by find method
  protected boolean found;  // true if target found, otherwise false
  protected int location;   // indicates location of target if found

  public ArrayCollection() 
  {
    elements = (T[]) new Object[DEFCAP];
  }

  public ArrayCollection(int capacity) 
  {
    elements = (T[]) new Object[capacity];
  }

  protected void find(T target)
  // Searches elements for an occurrence of an element e such that
  // e.equals(target). If successful, sets instance variables
  // found to true and location to the array index of e. If
  // not successful, sets found to false.
  // procedural abstraction, sequential search
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

  public boolean add(T element)
  {
	// Attempts to add element to this collection.
    // Returns true if successful, false otherwise.  
    if (isFull())
      return false;
    else
    {
      elements[numElements] = element;
      numElements++;
      return true;
    }
  }

  public boolean remove (T target)
  // Removes an element e from this collection such that e.equals(target)
  // and returns true; if no such element exists, returns false.
  {
    find(target);    
    if (found)
    {
      elements[location] = elements[numElements - 1];
      elements[numElements - 1] = null;
      numElements--;  
    }
    return found;
  }
  
  public boolean contains (T target)
  // Returns true if this collection contains an element e such that 
  // e.equals(target); otherwise, returns false.
  {
    find(target);
    return found;
  }

  public T get(T target)
  {
	// Returns an element e from this collection such that e.equals(target);
    // if no such element exists, returns null.  
    find(target);    
    if (found)
      return elements[location];
    else
      return null;
  }
  
  public boolean isFull()
  // Returns true if this collection is full; otherwise, returns false.
  {
    return (numElements == elements.length);
  }

  public boolean isEmpty()
  // Returns true if this collection is empty; otherwise, returns false.
  {
    return (numElements == 0);  
  }

  public int size()
  // Returns the number of elements in this collection. 
  {
    return numElements;
  }
  
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
  
  public ArrayCollection<T> combine(ArrayCollection<T> other)
  {
	  ArrayCollection<T> combination=new ArrayCollection<T>();

	  for(location=0;location<other.numElements;location++)
	  {
		  combination.elements[location]= other.elements[location];
	  }
	  for(int i=0; i<this.numElements;i++)
	  {
		  combination.elements[location++]= this.elements[i];
	  }
	  combination.numElements=combination.elements.length;
	  return combination;
  	}
  
  public String toString()
  {
	  String str = "";
	  
	  for(int i = 0; i < numElements; i++)
	  {
		  str = str + " " + elements[i];
	  }
	  str+="\n";
	  return str;
  }
}
