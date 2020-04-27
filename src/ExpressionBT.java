/* ExpressionBT:
 * Complete code below where you read "COMPLETE CODE HERE" 
 * or "MODIFY THIS"
 * You may also want to add methods where it says "ADD METHODS AS NEEDED"
 */

public class ExpressionBT {
	// Attributes: 
	private String     type;
	private char       operator;
	private int        value;
	private String     variable;
	private ExpressionBT left;
	private ExpressionBT right;
	
	// Constructors:
	public ExpressionBT() {}
	
	/* String[] e is the array representation of the 
	 * binary tree we want to create 
	 */
	public ExpressionBT(String[] e) {
		if (e.length == 0) return;
		
		int level = 0;
		int counter = 0;
		for (int i=0; i<e.length; i++) {
			counter++;
			if (counter == (int) (Math.pow(2,level+1))) level++;
			if (e[i] != null) this.insert(e[i], i, level);
		}
	}

	/* Insert information e in a BT given an integer n that describes 
	 * its location in the array (hence in the tree)
	 * and level describes the level at which the data will be inserted
	 * Pre-condition: this location is valid
	 */
	public void insert(String e, int n, int level) {
		
		if (n == 0) {
			// variable?
			if ((e.charAt(0) >= 97 && e.charAt(0) <= 122) 
					|| (e.charAt(0) >= 65 && e.charAt(0) <= 90)){
				type = "var";
				variable = e;
				return;
			}
			// value?
			if (e.charAt(0) >= 48 && e.charAt(0) <= 57) {
				type = "value";
				value = Integer.valueOf(e);
				return;
			}
			// operator?
			type = "operator";
			operator = e.charAt(0);
			return;
		}
		
		if (n == 1) {
			left = new ExpressionBT();
			left.insert(e, 0, level-1);
			return;
		}
		if (n == 2) {
			right = new ExpressionBT();
			right.insert(e, 0, level-1);
			return;
		}
		
		if (n + 2 - Math.pow(2,level) <= Math.pow(2,level-1)) {
			left.insert(e, n - (int)(Math.pow(2, level-1)), level - 1); 
		} else {
			right.insert(e, n-(int)(Math.pow(2,level)), level - 1); 
		}
	}
	
	public void printBT() {
		if (type != null) {
			System.out.print("Type: " + type + ": ");
			if (type.compareTo("var")==0)        System.out.println(variable);
			if (type.compareTo("operator")==0)   System.out.println(operator);
			if (type.compareTo("value")==0)      System.out.println(value);
			if (left != null)                    left.printBT();
			if (right != null)                   right.printBT();
		}
	}
	
	// Accessors:
	public String getType() 	                  { return type; }
	public int getValue() 		                  { return value; }
	public String getVariable()                   { return variable; }
	public ExpressionBT getLeft()                 { return left; }
	public ExpressionBT getRight()                { return right; }
	
	// Modifiers:
	public void setType(String t)	              { type = t; }
	public void setValue(int v)		              { value = v; }
	public void setVariable(String var)	          { variable = var; }
	public void setLeft(ExpressionBT b)           { left = b; }
	public void setRight(ExpressionBT b)          { right = b; }


	/* evaluate(): 
	 * traverses the expression using recursion and returns an integer: 
	 * the integer value of the expression. 
	 * Note: only if there are no variables in the expression. 
	 * If there are variables, print out that you cannot evaluate and return 0. 
	 * This method should be RECURSIVE
	 */
	public int evaluate() {
		// COMPLETE CODE HERE: RECURSIVE code
		return 0;
	}
	
	/* print(): 
	 * prints out the expression in infix notation with parentheses, using a BTStack
	 */
	public void print() {
		// COMPLETE CODE HERE: using a BTStack
	}
	
	/* allVariables(): 
	 * void method. 
	 * It prints out all variables in the tree, if any. 
	 * If there is no variable, it prints out “no variable in this expression”. 
	 * This method should use a BTQueue.
	 */
	public void allVariables() {
		// COMPLETE CODE HERE: using a BTQueue
	}
	
	/* includesVariables(): 
	 * returns true if the expression contains at least one variable, false otherwise
	 */
	public boolean includesVariables() {
		// COMPLETE CODE HERE
		return true; // MODIFY THIS LINE ONCE YOUR CODE IS READY
	}
	
}
