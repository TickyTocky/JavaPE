package com.stackroute.pe1;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args)
	{
		System.out.println("Enter first number ");
		
		Scanner sc = new Scanner (System.in);
		
		int a=sc.nextInt();
		sc.close();
		
		int number = a, number2 = a, rem = 0, palin = 0, add = 0, sum = 0;

		while(number > 0)
		{
			rem = number % 10;
			palin = (palin * 10) + rem;
			number = number / 10;
		}
		
		if(palin == a)
		{
			while(number2 > 0)
			{
				add = number2 % 10;
				
				if(add % 2 == 0)
				{
					sum = sum + add;
				}
				number2 = number2/10;
			}
			
			if(sum > 25)
			{
				System.out.println(a+" is palindrome and sum of even number is greater than 25");
			}
			else 
			{
				System.out.println(a+" is palindrome and sum of even number is not greater than 25");
			}
		}
		
		else
			System.out.println(a+" is not a palindrome ");
		
	}
}
