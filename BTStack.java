/* BTStack:
 * Complete code below where you read "COMPLETE CODE HERE" 
 * or "MODIFY THIS"
 * You may also want to add methods where it says "ADD METHODS AS NEEDED"
 */

public class BTStack {

	// Attributes
	private ExpressionBT top;
	private ExpressionBT[] data;
	private int topInt;
	// COMPLETE CODE HERE
	
	// Constructors
	public BTStack() {}
	
	// Modifiers
	
	/* Peek: MODIFY THIS METHOD BASED ON YOUR  
	  * IMPLEMENTATION OF YOUR STACK (ARRAY OR LINKED LIST)
	  */
	public ExpressionBT peek()
	{
        // COMPLETE CODE HERE

		if (top == null)			// return null when there are no elements at the array
			return null;
		else
		{
			return top;	// return the node at the top
		}
	}
	
	/* Push:
	 */
	public void push(ExpressionBT Node) {
		// COMPLETE CODE HERE

		if (data.length == 0){
			topInt = 0;
			data[topInt]= Node;
			top = Node;

		}

		else if (topInt >=data.length)  // when the array is full then we create a new array with a size double than the first array
									// and continue to push
		{
			ExpressionBT[] ndata = new ExpressionBT[data.length];


			for (int i = 0; i<data.length; i++)
			{
				ndata[i]=data[i];
			}

			topInt++;
			ndata[topInt] = Node;
			top = Node;

		}

		else
		{
			topInt++;
			data[topInt] = Node;
			top = Node;

		}
	}
	
	/* Pop: MODIFY THIS METHOD BASED ON YOUR  
	 * IMPLEMENTATION OF YOUR STACK (ARRAY OR LINKED LIST)
	 */
	public ExpressionBT pop() {
        // COMPLETE CODE HERE

		if (topInt == -1)     // return null when there are no elements in the array
			return null;
		else
		{
			ExpressionBT temp = data[topInt];   // update top and pop the previous value at top
			topInt--;
			top = data[topInt];
			return temp;
		}

		
	}

	// ADD METHODS AS NEEDED

	public boolean isEmpty()	// ony return true if the array is empty
	{
		if( top == null)
			return true;
		else
			return false;
	}

	public boolean isFull()   // only returns true if the array is full
	{
		if( top == data[data.length-1])
			return true;
		else
			return false;
	}

}
