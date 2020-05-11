/* IntStack:
 * Complete code below where you read "COMPLETE CODE HERE" 
 * or "MODIFY THIS"
 * You may also want to add methods where it says "ADD METHODS AS NEEDED"
 */


public class IntStack {

	// Attributes
	private int [] data;
	private int top;
	// COMPLETE CODE HERE
	
	// Constructors
	public IntStack() {}
	
	/* Peek: MODIFY THIS METHOD BASED ON YOUR  
	  * IMPLEMENTATION OF YOUR STACK (ARRAY OR LINKED LIST)
	  */

	public int peek() {
		// COMPLETE CODE HERE
		if (top == -1)			// return null when there are no elements at the array
			return 0;
		else
		{
			return data[top];	// return the int at the top
		}
	}
	
	/* Push:
	 */
	public void push(int value) {
		// COMPLETE CODE HERE
		if (data.length == 0){
			top = 0;
			data[top]= value;
		}

		else if (top == (data.length - 1)){
			System.out.print("Stack is empty,it was not possible to push "+ value);
		}

		else
		{
			top++;
			data[top] = value;
		}
	}
	
	/* Pop: MODIFY THIS METHOD BASED ON YOUR  
	 * IMPLEMENTATION OF YOUR STACK (ARRAY OR LINKED LIST)
	 */
	public int pop() {
		// COMPLETE CODE HERE

		if (top == -1)     // return null when there are no elements in the array
			return 0;
		else
		{
			int temp = data[top];   // update top and pop the previous value at top
			top--;
			return temp;
		}

	}

	// ADD METHODS AS NEEDED
	public boolean isEmpty()	// ony return true if the array is empty
	{
		if( top == - 1)
			return true;
		else
			return false;
	}

	public boolean isFull()   // only returns true if the array is full
	{
		if( top == (data.length -1))
			return true;
		else
			return false;
	}

}
