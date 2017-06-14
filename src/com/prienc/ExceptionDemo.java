/*Here we create a class named as ExceptionDemo and inside the main method call another method void doSomething()
in it, and inside doSomething() call another method void doMore() . Now inside the doMore() divide an
interger number with zero.
 * 
 */
package com.prienc;
//We have created a class named as ExceptionDemo
public class ExceptionDemo {
	//Creating a method named as doSOMETHING
	public void doSomething(){
		//Calling the function Do more
		doMore();
		System.out.println("I am doing something");
	
	}
	//Creating a function doMore
	public int doMore(){
		int a=10;
		int b=0;
		 b=a/b;
		return b;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating the object of Exception	Demo
		ExceptionDemo myobject= new ExceptionDemo();
		//Calling a method doMore
		myobject.doSomething();

	}

}
