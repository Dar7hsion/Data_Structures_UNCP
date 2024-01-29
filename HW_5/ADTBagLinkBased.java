import java.util.Random;

public class ADTBagLinkBased<T> implements BagInterface<T>
{
	  protected LLNode<T> head;       // head of the linked list
	  protected int numElements = 0;  // number of elements in this collection

	  // set by find method
	  protected boolean found;        // true if target found, else false
	  protected LLNode<T> location;   // node containing target, if found
	  protected LLNode<T> previous;   // node preceding location
	  
	  public ADTBagLinkBased()
	  {
	    numElements = 0;
	    head = null;
	  }

	@Override
	public boolean add(java.lang.Object element) 
	{
		LLNode<T> newNode = new LLNode<T>((T) element);
	    newNode.setLink(head);
	    head = newNode;
	    numElements++;
	    return true;
	}
	
	protected void find(java.lang.Object target)
	  // Searches the collection for an occurence of an element e such that
	  // e.equals(target). If successful, sets instance variables
	  // found to true, location to node containing e, and previous
	  // to the node that links to location. If not successful, sets 
	  // found to false.
	  {
	    location = head;
	    found = false;

	    while (location != null) 
	    {
	      if (location.getInfo().equals(target))  // if they match
	      {
	       found = true;
	       return;
	      }
	      else
	      {
	        previous = location;
	        location = location.getLink();
	      }
	    }
	  }

	@Override
	public java.lang.Object get(java.lang.Object target) 
	{
		  // Returns an element e from this collection such that e.equals(target);
		  // if no such element exists, returns null.
		  {
		    find(target);    
		    if (found)
		      return location.getInfo();
		    else
		      return null;
		  }
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
		  // and returns true; if no such element exists, returns false
		  find(target);
		  if (found)
		  {
		      if (head == location)     
		        head = head.getLink();    // remove first node
		      else
		        previous.setLink(location.getLink());  // remove node at location

		      numElements--;
		   }
		   return found;
	}

	@Override
	public boolean isFull() 
	{
		return false;  // Linked implementation is never full
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
		int randNode = rand.nextInt(numElements +1);
		location = head;
		LLNode<T> tempNode = null;
			
    	for(int i = 0; i < randNode; i++)
    	{
    		if(i == 0)
    		{
    			tempNode = head;
    		}
    		else
    		{
    			previous = location;
		        location = location.getLink();
		        tempNode = location;
    		}
    	}
    	remove(location);
    	return tempNode.getInfo();

	}

	@Override
	public int count(java.lang.Object target) 
	{
		int count = 0;
		location = head;
	    
		if(numElements == 0)
		{
			return count;
		}
		else
		{
		    while (location != null)
		    {
		    	if (location.getInfo().equals(target))  // if they match
		        {
		         count++;
		         previous = location;
		         location = location.getLink();
		        }
		        else
		        {
		          previous = location;
			      location = location.getLink();
		        }
		    }
		}
		return count;
	}

	@Override
	public int removeAll(java.lang.Object target) 
	{
		int count = 0;
		location = head;
	    
		if(numElements == 0)
		{
			return count;
		}
		else
		{
		    while (location != null)
		    {
		    	if (location.getInfo().equals(target))  // if they match
		        {
			         if (head == location)
			         {
			        	 head = head.getLink();    // remove first node
			         }
					 else
					 {
						  previous.setLink(location.getLink());  // remove node at location
					 }
			         count++;
					 numElements--;
			         previous = location;
			         location = location.getLink();
		        }
		        else
		        {
			         previous = location;
			         location = location.getLink();
		        }
		    }
		}
		return count;
	}

	@Override
	public void clear() 
	{
		head = null;
		numElements = 0;
	}
	
	public  String toString()
	{
		String str = "";
		location = head;
		
		while(location != null)
		{
			str += (location.getInfo() + " ");
;			previous = location;
	        location = location.getLink();
		}
		
		return str;
	}

}
