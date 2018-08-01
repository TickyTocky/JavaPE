package com.stackroute.pe1;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args)
	{
		int remainder = 0, palin = 0, count = 0;
		System.out.println("Enter a number :- ");
		
		Scanner sc = new Scanner (System.in);
		
		int a =sc.nextInt();
		sc.close();
		int number = a, number2 = a, count2 = 0, remainder2 = 0, j = 0, temp, sum = 0;
		
		while(number > 0)
		{
			remainder = number % 10;
			count = count + 1;
			number = number / 10;
		}
		
		int arr[] = new int[count];
		
		while(number2 > 0)
		{
			remainder2 = number2 % 10;
			arr[j] = remainder2;
			count2 = count2 + 1;
			number2 = number2 / 10;
			j = j + 1;
		}
		
		
		for(int i = 0; i < count; i++)
		{
			for(int k = i + 1; j < count; j++)
			{
				if(arr[i] < arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < count; i++)
		{
			System.out.print(arr[i]);
		}
		
		for(int i = 0; i < count;i++)
		{
			if(arr[i] % 2 == 0)
			{
				sum = sum + arr[i];
			}
		}
		
		if(sum > 15)
		{
			System.out.println("\nSum of Even Numbers is :- " + sum);
		}
		
		else
		{
			System.out.println("False");
		}
	}
}