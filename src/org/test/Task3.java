package org.test;

public class Task3
{
 public static void main(String[]args)
 {
	 try
	 {
		 System.out.println("1");
		 int data=5/0;
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("2");
		 System.exit(0);
	 }
	 finally
	 {
		 System.out.println("3");
	 }
 }
}
