/* PostfixExpression:
 * Complete code below where you read "COMPLETE CODE HERE"
 */


import java.lang.Math;

public class PostfixExpression {

	// Attributes: 
	private String expression;
	
	// Constructors:
	public PostfixExpression() {}
	
	public PostfixExpression(String e) {expression = e;}
	
	// Accessor:
	public String getExpression() {return expression;}
	
	// Modifier:
	public void setExpression(String e) {expression = e;}
	
	// Print out the expression: 
	public void print()
	{
		// COMPLETE CODE HERE
		System.out.print(evaluate()); // print the method evaluate since it return the result of the expression which
										// the last element of the stack.
	}
	
	// Evaluate expression:
	public int evaluate() {
		IntStack S = new IntStack();

		// COMPLETE CODE HERE

		for( int i = 0; i < expression.length(); i++) // traverse through the string
		{
			boolean digit = Character.isDigit(getExpression().charAt(i));  // boolean to identify if the char is an integer
			int digitInt;
			if (digit)			// if true we store the integer and push it to the stack
			{
				digitInt = getExpression().charAt(i);
				S.push(digitInt);
			}
			else    // if it is an operator then we pop 2 types the stack and use the operator and then push the result
			{
				char operator = getExpression().charAt(i);
				int num1 = S.pop();
				int num2 = S.pop();
				int newNum;
				if (operator == '+') 			// if the operator is plus we sum the integers that were poped
				{
					newNum = num1 + num2;
					S.push(newNum);
				}
				else if (operator == '-')		// if the operator is minus we substract the integers that were poped
				{
					newNum = num1 - num2;
					S.push(newNum);
				}
				else if (operator == '/')     		// if the operator is a slash we divide the integers that were poped
				{
					newNum = num1 / num2;
					S.push(newNum);
				}
				else if (operator == '^')       // if the operator is a ^ we power the first integers with the second integer
				{
					newNum = (int) Math.pow(num1, num2);
					S.push(newNum);
				}
				else if (operator == '*')   // if the operator is a * we multiply the integers
				{
					newNum = num1 * num2;
					S.push(newNum);
				}
			}
		}
		
		return S.pop(); // return result (last element in the stack)
	}
}
