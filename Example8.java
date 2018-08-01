package com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;

public class Example8 {
	public static void main(String[] args)
	{
		int correct=0;
		Scanner sc = new Scanner (System.in);
		sc.close();

		Random rand = new Random();
		int  n = rand.nextInt(50) + 1;
		
		while(correct != 1)
		{
			System.out.println("Guess a number :- ");
			int a = sc.nextInt();
			if(a == n)
			{
				System.out.println("Number is correct.");
				correct = 1;
			}
			else if(a > n)
			{
				System.out.println("Guess is greater than original number.");
			}
			else
			{
				System.out.println("Guess is smaller than original number.");
			}
		}
	}
}