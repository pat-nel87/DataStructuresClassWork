/**
   A driver that demonstrates the class LinkedStack.
   
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public class Test 
{
	public static void main(String[] args) 
	{
		testStackOperations();
		System.out.println("\n\nDone.");
	}  // end main

	public static void testStackOperations()
	{
		System.out.println("Create a stack: ");
		StackInterface<String> myStack = new LinkedStack<>();
		System.out.println("isEmpty() returns " + myStack.isEmpty());
		
		System.out.println("\nAdd to stack to get\n" +
		                   "Joe Jane Jill Jess Jim");
		myStack.push("Jim");
		myStack.push("Jess");
		myStack.push("Jill");
		myStack.push("Jane");
		myStack.push("Joe");

		System.out.println("\nisEmpty() returns " + myStack.isEmpty());

		System.out.println("\nTesting peek2");

		System.out.println(myStack.peek2());
		// write your code here to test peek2( ) method
		
		
		
		
		
		
	} // end testStackOperations
}  // end Driver

