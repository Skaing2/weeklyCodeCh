package March14_19;

import java.util.Stack;

/*
 * 2) Implement a stack that has the following methods:
• push ( val ) : push val onto the stack
• pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
• max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.
 */
public class CodeCh2 {
	// Stack Push Method Function:
	public  static void push(Stack<String> value) {
		value.push("v"); // .push adds an element into a stack
		value.push("a");
		value.push("l");
		// System.out.println(value);
	}
	
	// Stack Pop Method Function:
	public static void pop(Stack<String> value) {
		try {
			if(value == null) {
				//Thrown when an application attempts to use null in a case where an object is required.
				throw new NullPointerException();
			} else {
				value.pop(); // .pop removes the last element of in the stack
			}
		} catch (Exception e) {
			e.printStackTrace(); // method in Java is a tool used to handle exceptions and errors.
		}
		System.out.println(value);
	}
	
	// Stack Max Method Function:
	public static void max(Stack<String> value) {
		if(value == null) {
			throw new NullPointerException();
		} else {
			System.out.println(value.peek()); // .peek  retrieve or fetch the first element 
											  // of the Stack or the element present at the top of the Stack.
		}
		
		/* Or we can do the try and catch
		 * 
		 * try {
				if(value == null) {
					throw new NullPointerException();
				} else {
					val.peek();
		   } catch (Exception e) {	
				e.printStackTrace();
		   }
		   System.out.println(val.peek());
		 */
	}
	
	public static void main(String[] args) {
		Stack<String> stacks = new Stack<>();
		push(stacks);
		pop(stacks);
		max(stacks);
	}

}
