package application.model;
import java.util.NoSuchElementException;

/**
 * A stack using linked lists of nodes.
 * @param <T> The type of data permitted on this stack.
 */
public class Stack<T>
{
	private Node top;	  // Top of the stack.

  /**
   * A Node for one item .
   */
  private class Node
  {
    private T item;       // The data item.
    private Node next;    // Next node on this stack.

    /**
     * Create a Node.
     * @param item The item for this node.
     * @param next The next node.
     */
    private Node(T item, Node next)
    {
      this.item = item;
      this.next = next;
    }
  }

  public void push(T item)
  {
	  this.top = new Node(item, this.top);
  }

  public T pop()
  {
	  if (isEmpty()) throw new NoSuchElementException("Stack is empty");
	  T item = this.top.item;
	  this.top = this.top.next;
	  return item;
  }

  public boolean isEmpty()
  {
	  return this.top == null;
  }
  
  /**
   * Obtain the top item without removing it.
   * @return The top item without removing it.
   */
  public T peek()
  {
	  if (isEmpty()) throw new NoSuchElementException("Stack is empty");
	  return this.top.item;
  }
}