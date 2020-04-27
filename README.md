# Week 14: Stacks and Queues with Binary Trees
In this lab assignment, we are going to practice using stacks and queues with binary trees. We hope you enjoy this assignment! Let’s get started!

## What is the scenario?
In this lab, we are going to play with arithmetic expressions. 
<br/>You are going to use two main representations of arithmetic expressions: post-fix notation (see class notes for details on what post-fix notation is) and as binary trees (see class notes for details on what such binary trees are like).
<br/>You will use the post-fix notation to evaluate your expression.
<br/>You will use the binary tree representation to: 1/ evaluation your expression, 2/ print your expression in in-fix notation with parentheses, and 3/ traverse it in level-order fashion to gather the list of all of its values and variables.

## Let’s build data structures
For this, you are going to have to manipulate / design a few types. We are providing you with the following guidelines:
- Post-fix notation of an arithmetic expression  represented by a string. You will define a type PostfixExpression.
- Binary tree of an arithmetic expression  represented by a binary tree of data, called ExpressionBT that contains:
	- String type: can be “var”, “value”, or “operator”
	- char operator: can be ‘+’, '-', ‘*’, ‘/’
	- int value
	- String variable: can be any identifier for a variable, e.g., “x”, “y”, “z”, “x1”, “myVar”.
	- _Note_: depending on what type contains, only one of the other 3 attributes will be relevant.

Let’s go over the details you will need to implement for each type. Note that written in orange are all the methods and attributes given to you already:
| _Type_: PostfixExpression |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| _Private Attributes_:<br>-`String expression` |
| _Methods_:<br>__Constructors__: <br>- `PostfixExpression()`<br>- `PostfixExpression(String e)`<br>__Accessors / getters__:<br>- `getExpression()`: _returns expression string_<br>__Modifiers / setters__:<br>- `setExpression(String newExpr)`: _assigns newExpr to expression_<br>__Other methods__:<br>- `evaluate()`: _traverses the expression using IntStack and returns an integer: the integer value of the expression_<br>- `print()`: _prints out the expression in postfix notation_ |

| _Type_: ExpressionBT |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| _Private Attributes_:<br>- `String type`<br>- `char operator`<br>- `int value`<br>- `String variable`<br>- `ExpressionBT left`<br>- `ExpressionBT right` |
| _Methods_:<br>__Constructors__: <br>- `ExpressionBT()`<br>- `ExpressionBT(String[] e)`<br>__Accessors / getters__:<br>- `getType()`<br>- `getValue()`<br>- `getVariable()`<br>- `getLeft()`<br>- `getRight()`<br>__Modifiers / setters__:<br>- `setType(String t)`<br>- `setValue(int v)`<br>- `setVariable(String var)`<br>- `setLeft(ExpressionBT b)`<br>- `setRight(ExpressionBT b)`<br>__Other methods__:<br>- `evaluate()`: _traverses the expression using recursion and returns an integer: the integer value of the expression. __Note__: only if there are no variables in the expression. If there are variables, print out that you cannot evaluate and return 0_<br>- `print()`: _prints out the expression in infix notation with parentheses, using a BTStack_<br>- `allVariables()`: _void method. It prints out all variables in the tree, if any. If there is no variable, it prints out “no variable in this expression”. This method should use a BTQueue._<br>- `includesVariables()`: _returns true if the expression contains at least one variable, false otherwise_ |

To implement a few of the above methods, you will need to have a few additional types: 
- A stack of integers, called `IntStack`
- A stack of nodes (nodes that form your expression binary tree), `BTStack`
- A queue of nodes (nodes that form your expression binary tree): `BTQueue`

You are free to use any implementation you like of the above types, provided that they respect the following signatures of methods:
- For both stacks:
	- `peek()`: returns the relevant content of the top element without removing it from the stack
	- `pop()`: returns the top element and removes it from the stack
	- `push(data d)`: adds d on top of the stack
- For the queue:
	- `peek()`: returns the relevant content of the head element without removing it from the queue
	- `dequeue()`: returns the top element and removes it from the queue
	- `enqueue(data d)`: adds d to the tail of the queue

_Note_: You may have to implement additional methods such as `isEmpty` or `isFull`, depending on your implementation choices.

_NOTE_ we provide you with:
- Some code pertaining to `ExpressionBT.java`; 
- Starter code for `PostfixExpression.java`; 
- Starter code for `IntStack.java`;
- Starter code for `BTStack.java`; and
- Starter code for `BTQueue.java`.

You have to complete all of the above files by following the guidelines provided to you earlier in this document.
<br/>You also have to provide 5 test cases for each of the major methods: the two `evaluate` methods, `allVariables`, and `print`, in a file called `BTSQTester.java`.

## Grading
There is a total of 350 pts. You are required to complete 220 pts to get 100%.
| Points | Item | 
| ---- | ----- | 
| 40 pts | `PostfixExpression.java` |
| | 20 for `evaluate()` |
| | 20 for `print()` |
| 80 pts | `ExpressionBT.java` |
| | 20 for `evaluate()` |
| | 20 for `print()` |
| | 20 for `allVariables()` |
| | 20 for `includesVariables()` |
| 60 pts | `IntStack.java` |
| | 20 for `peek()` |
| | 20 for `pop()` |
| | 20 for `push(data d)` |
| 60 pts | `BTStack.java` |
| | 20 for `peek()` |
| | 20 for `pop()` |
| | 20 for `push(data d)` |
| 60 pts | `BTQueue.java` |
| | 20 for `peek()` |
| | 20 for `dequeue()` |
| | 20 for `enqueue(data d)` |
| 40 pts | `BTSQTester.java` |
| | 10 for 5 test cases for `evaluate()` _for PostfixExpression_ |
| | 10 for 5 test cases for `evaluate()` _for ExpressionBT_ |
| | 10 for 5 test cases for `print()` _for ExpressionBT_ |
| | 10 for 5 test cases for `allVariables()` _for ExpressionBT_ |

## Due Date
Your assignment should be submitted on GitHub by __Friday, May 8th at 11:59 pm__.

## How to submit
Check with your own TA for submission guidelines.
<br/>Failing to follow submission instructions and guidelines will result in up to 15 points off your overall grade in this lab. So please pay attention.