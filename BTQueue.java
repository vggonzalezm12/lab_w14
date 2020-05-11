/* BTQueue:
 * Complete code below where you read "COMPLETE CODE HERE" 
 * or "MODIFY THIS"
 * You may also want to add methods where it says "ADD METHODS AS NEEDED"
 */

public class BTQueue {

	// Attributes
	private int front;
	private int end;
	private int numElements;
	private ExpressionBT[] data;

	// COMPLETE CODE HERE
	
	// Constructors
	public BTQueue() {}
	
	/* Peek: MODIFY THIS METHOD BASED ON YOUR  
	  * IMPLEMENTATION OF YOUR QUEUE (ARRAY OR LINKED LIST)
	  */
	public ExpressionBT peek() {
	    // COMPLETE CODE HERE
		if(numElements == 0)
			return null;
		else
			return data[front];// MODIFY THIS LINE WHEN YOUR CODE IS READY
	}


	/* Enqueue:
	 */
	public void enqueue(ExpressionBT Node) {
		// COMPLETE CODE HERE

		if (numElements == 0)
		{
			data[0] = Node;    // every time the array is empty it will start again from the index 0 to easily re-arrange
			data[front] = Node;
			numElements++;

		}
		else if (numElements != 0 && numElements < data.length+1) // when the array is not empty and not full
		{
			end = (front + numElements)% data.length; // use tail to keep track the position of the last element
			data[end] = Node;
			numElements++;
		}

	}
	
	/* Pop: MODIFY THIS METHOD BASED ON YOUR  
	 * IMPLEMENTATION OF YOUR QUEUE (ARRAY OR LINKED LIST)
	 */
	public ExpressionBT dequeue() {
	    // COMPLETE CODE HERE

		ExpressionBT temp = data[front];
		numElements--;
		front = (front + 1) % data.length;

		return temp;
		// MODIFY THIS LINE WHEN YOUR CODE IS READY
	}

	// ADD METHODS AS NEEDED

}
