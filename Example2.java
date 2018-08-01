package com.stackroute.pe1;
import java.util.Scanner;

public class Example2 
{
	public static void main(String[] args)
	{
		System.out.println("Enter number:- ");
		Scanner sc = new Scanner (System.in);
		
		int number = sc.nextInt();
		sc.close();
		
		if (number % 2 != 0 && number >= 20 && number <= 30)
		{
			System.out.println("Tom");
		}
		else if (number %2 == 0 && number >= 20 && number <= 30)
		{
			System.out.println("Jerry");
		}
		else
		{
			System.out.println("Condition is not satisfied...");
		}
	}
}
	
