/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Joey
 */
class Exceptions								 
{
	public static void main(String[] args)
	{
		int x[] = {2, 4, 6};
		method(0, x);
		method(x[2], x);
		method(2, x);
	}



	static void method(int i, int arr[])
	{
		String str = "Yes its true";
		try 
		{
			System.out.println("Programming II");
			System.out.println("This first value is " + arr[i]);
			System.out.println("This second value is " + arr[i]/(arr[i]  - 6));
			System.out.println("This line will be printed");
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithemticException caught");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException caught");
		}
		finally 
		{
			System.out.println(str);
		}
	}
}
