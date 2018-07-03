/** Chapter No. 15 - Exercise No. 1 
   File Name:          Prince.java
   Programmer:         Broderick Higby
   Date Last Modified: November 17, 2015

	Program Description: 
 *Algorithm:
	- Create a linked list class
	- Create instance variables: head of type root, node, count of type int, & number of type node
	- Use next and previous to reference other nodes
	- default constructors
	- Accessors and mutators for the instance variables 
 */
public class Prince
{
	private Node head;
	private static int count;
	
	public Prince( Node head, int count)
	{
		this.head = head;
		this.count = count;
	}
	public Prince(Node head)
	{
		head = null;
		count = 0;
	}
	public void setHead(Node head)
	{
		this.head = head;
	}
	public Node getHead()
	{
		return head;
	}
	public void setCount(int count)
	{
		Prince.count = count;
	}
	public int getCount()
	{
		return count;
	}
}

