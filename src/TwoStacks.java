
/**
 *  @author Lewis and Chase
 *  
 *  	WITH CHANGES FOR THE SUBJECT DSA AT THE UPV/EHU
 *
 *  Represents an array implementation of a stack.
 */
import exceptions.EmptyCollectionException;


public class TwoStacks
{ 

  /**
   * array of generic elements to represent the stack
   */
  private int index1;
  private int index2;
  private int sizeArray;
  private int stacks[];

  /**
   * Creates an empty stack using the specified capacity.
   * @param initialCapacity represents the specified capacity 
   */
  public TwoStacks (int sizeArray)
  {
	this.sizeArray = sizeArray;
    stacks = new int[sizeArray];
    index1 = 0;
    index2 = sizeArray-1;
  }

  /**
   * Adds the specified element to the top of this stack, expanding
   * the capacity of the stack array if necessary.
   * @param element generic element to be pushed onto stack
   */
  public void push1 (int element)
  {
    if(!isFull()) {
    	
    	stacks[index1] = (int)element;
        index1++;
    }
    
  }
  
  public void push2 (int element)
  {
	if(!isFull()) {
		stacks[index2] = (int)element;
	    index2--;
	}
    
  }
  
  

  /**
   * Removes the element at the top of this stack and returns a
   * reference to it. Throws an EmptyCollectionException if the stack
   * is empty.
   * @return T element removed from top of stack
   * @throws EmptyCollectionException if a pop is attempted on empty stack
   */
  public int pop1() throws EmptyCollectionException
  {
    if (isEmpty1())
      throw new EmptyCollectionException("Stack");
    
    int element = stacks[index1];
    index1--;
    return element;
  
  }
  
  public int pop2() throws EmptyCollectionException
  {
    if (isEmpty2())
      throw new EmptyCollectionException("Stack");
    
    int element = stacks[index2];
    index2++;
    return element;
  }
  /**
   * Returns true if this stack is empty and false otherwise. 
   * @return boolean true if this stack is empty, false otherwise
   */
  public boolean isEmpty1()
  {
    return (index1 == 0);
  }
  
  public boolean isEmpty2()
  {
    return (index2 == sizeArray);
  }
  
  public boolean isFull() {
	  
	  return (index1 == index2);
  }
}
